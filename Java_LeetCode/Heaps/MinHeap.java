package Heaps;

public class MinHeap {
    int[] minHeap;
    int heapSize;
    int realSize = 0;

    public MinHeap(int heapSize){
        this.heapSize  = heapSize;
        minHeap = new int[heapSize+1];
        minHeap[0] = 0;
    }

    public void addElement(int element){
        realSize++;
        if (heapSize < realSize){
            System.out.println("OverFlow");
            realSize--;
            return;
        }
        minHeap[realSize] = element;
        int idx = realSize;
        int parent = idx / 2;

//        maintain heap prop
        while ( minHeap[idx] < minHeap[parent] && idx > 1){
            int temp = minHeap[parent];
            minHeap[parent] = minHeap[idx];
            minHeap[idx] = temp;
            idx = parent;
            parent = idx / 2;
        }
    }

//    get top element of array
    public int peek(){
        return minHeap[1];
    }
//    return top element and delete
    public int pop(){
        if ( realSize < 1){
            System.out.println("No elements");
            return Integer.MAX_VALUE;
        }else {
            int root = minHeap[1];
            minHeap[1] = minHeap[realSize];
            realSize--;
//            update heap property
            int idx = 1;
            while (idx <= realSize / 2){
                int leftChild = idx * 2;
                int rightChild = (idx * 2) + 1;
                if ( minHeap[idx] > minHeap[leftChild] || minHeap[idx] > minHeap[rightChild]){
                    if (minHeap[leftChild] < minHeap[rightChild]){
                        int temp = minHeap[leftChild];
                        minHeap[leftChild] = minHeap[idx];
                        minHeap[idx] = temp;
                        idx = leftChild;
                    }else {
                        int temp = minHeap[rightChild];
                        minHeap[rightChild] = minHeap[idx];
                        minHeap[idx] = temp;
                        idx = rightChild;
                    }
                }else break;

            }

        return root;
        }

    }

    public int size(){
        return realSize;
    }

    public String toString(){
        if (realSize == 0)
            return "No element";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < realSize; i++) {
                sb.append(minHeap[i]);
                sb.append(',');
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append(']');
            return sb.toString();
        }
    }

}
