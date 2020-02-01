package com.learning.groovy.list

class ListCopy {
    static void main(String[] args) {
        def l1 = [1, 2, 3]
        assert l1 * 3 == [1, 2, 3, 1, 2, 3, 1, 2, 3]

        assert l1.multiply(2) == [1, 2, 3, 1, 2, 3]

        assert Collections.nCopies(3, 'b') == ['b', 'b', 'b']

        assert Collections.nCopies(2, [1, 2]) == [[1, 2], [1, 2]]
    }
}
