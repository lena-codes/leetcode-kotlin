package solutions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TwoNumbers {

    @Test
    fun `add two nums`() {
        val l1 = ListNode(9)
        l1.next = ListNode(9)
        l1.next!!.next = ListNode(9)
        l1.next!!.next!!.next = ListNode(9)
        l1.next!!.next!!.next!!.next = ListNode(9)
        l1.next!!.next!!.next!!.next!!.next = ListNode(9)
        l1.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)

        val l2 = ListNode(9)
        l2.next = ListNode(9)
        l2.next!!.next = ListNode(9)
        l2.next!!.next!!.next = ListNode(9)

        val resultNode = AddTwoNumbers.addTwoNumbers(l1, l2)
        val expectedResult = arrayListOf(8, 9, 9, 9, 0, 0, 0, 1)

        assertEquals(expectedResult, translateToArray(resultNode))
    }

    @Test
    fun `add two nums basic`() {
        val l1 = ListNode(0)

        val l2 = ListNode(0)

        val resultNode = AddTwoNumbers.addTwoNumbers(l1, l2)
        val expectedResult = arrayListOf(0)

        assertEquals(expectedResult, translateToArray(resultNode))
    }

    private fun translateToArray(l: ListNode?): ArrayList<Int> {
        val result = ArrayList<Int>()
        var current = l
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        return result
    }

}