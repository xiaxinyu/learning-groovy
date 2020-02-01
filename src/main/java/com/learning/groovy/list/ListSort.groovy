package com.learning.groovy.list

class ListTest2 {
    static void main(String[] args) {
        def l1 = [6, -3, 9, 2, -7, 1, 5]

        Collections.sort(l1)
        assert l1 == [-7, -3, 1, 2, 5, 6, 9]

        Comparator mc = { a, b -> a > b ? -1 : 1 }
        Collections.sort(l1, mc)
        assert l1 == [9, 6, 5, 2, 1, -3, -7]
    }
}
