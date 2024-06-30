package Heaps;

public class MaxHeapSol {
    int[] maxHeap;
    int heapSize;
//    elements in heap
    int realSize = 0;
    public MaxHeapSol(int heapSize){
        this.heapSize = heapSize;
        maxHeap = new int[this.heapSize+1];
        maxHeap[0] = 0;
    }
    public void add(int element){
        realSize++;
        if (realSize > heapSize){
            System.out.println("Too Many Elements");
            realSize--;
            return;
        }
        maxHeap[realSize] = element;
        int idx = realSize;
        int parent = idx / 2;
//        added val > parent val -> swap
        while ( maxHeap[idx] > maxHeap[parent] && idx > 1){
            int temp = maxHeap[idx];
            maxHeap[idx] = maxHeap[parent];
            maxHeap[parent] = temp;
            idx = parent;
            parent = idx / 2;
        }
    }

//    get top elemet
    public int peek(){
        return maxHeap[1];
    }

    public int pop(){
        if (realSize < 1){
            System.out.println("No Elements");
            return Integer.MIN_VALUE;
        }else {
            int removeElem = maxHeap[1];
//            last elem to top
            maxHeap[1] = maxHeap[realSize];
            realSize--;
            int ix = 1;
            //deleted not leaf
            while (ix <= realSize / 2){
                int leftChild = ix * 2;
                int rightChild = ix * 2 + 1;

//                delete element < (left || right)
//                replace large(leftChild, rightChild)
                if (maxHeap[ix] < maxHeap[leftChild] || maxHeap[ix] < maxHeap[rightChild]){
                    if (maxHeap[leftChild] > maxHeap[rightChild]){
                        int temp = maxHeap[leftChild];
                        maxHeap[leftChild] = maxHeap[ix];
                        maxHeap[ix] = temp;
                        ix = leftChild;
                    }else {
                        int temp = maxHeap[rightChild];
                        maxHeap[rightChild] = maxHeap[ix];
                        maxHeap[ix] = temp;
                        ix = rightChild;
                    }

                }else break;
            }
            return removeElem;
        }
    }

    public int size(){
        return realSize;
    }

    public String toString(){
        if (realSize == 0){
            return "No Element";
        }
        else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i <= realSize; i++) {
                sb.append(maxHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(']');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Test case
        MaxHeapSol maxheap = new MaxHeapSol(5);
        maxheap.add(1);
        maxheap.add(2);
        maxheap.add(3);
        // [3,1,2]
        System.out.println(maxheap.toString());
        // 3
        System.out.println(maxheap.peek());
        // 3
        System.out.println(maxheap.pop());
        System.out.println(maxheap.pop());
        System.out.println(maxheap.pop());
        // No element
        System.out.println(maxheap.toString());
        maxheap.add(4);
        // Add too many elements
        maxheap.add(5);
        // [4,1,2]
        System.out.println(maxheap.toString());
    }
}