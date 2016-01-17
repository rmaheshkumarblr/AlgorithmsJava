package DataStructure;

/**
 * Created by maheshkumar on 17 January 2016.
 */
public class listNode
{
    //next points to the next listNode
    public listNode next;
    public int data;

    public listNode()
    {
        this.next = null;
        this.data = Integer.MIN_VALUE;
    }

    public listNode(int data)
    {
        this.next = null;
        this.data = data;
    }

    public listNode getNext()
    {
        return this.next;
    }

    public void setNext(listNode next)
    {
        this.next = next;
    }

    public int getData()
    {
        return this.data;
    }

    public void setData(int data)
    {
        this.data = data;
    }


}
