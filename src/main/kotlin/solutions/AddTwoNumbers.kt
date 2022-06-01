package solutions

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

object AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        var offset: Int
        var currentL1 = l1
        var currentL2 = l2
        val result = ListNode(0)
        var currentResultNode = result

        do {
            val sum = (currentL1?.`val` ?: 0) + (currentL2?.`val` ?: 0) + currentResultNode.`val`
            offset = if (sum > 0) sum / 10 else 0
            currentResultNode.`val` = sum % 10
            if (currentL1 != null) {
                currentL1 = currentL1.next
            }
            if (currentL2 != null) {
                currentL2 = currentL2.next
            }
            if (offset > 0 || currentL1 != null || currentL2 != null) {
                currentResultNode.next = ListNode(offset)
                currentResultNode = currentResultNode.next!!
            }
        } while (currentL1 != null || currentL2 != null)
        return result
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}