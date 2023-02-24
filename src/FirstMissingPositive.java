import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] arr) {

        int i = 0 ;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i]<=arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }

        for(int index = 0 ; index<arr.length ; index++ ){
            if(arr[index] != index + 1){
                return index+1;
            }
        }
       return arr.length + 1;



    }


    public void swap (int[] arr , int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }




}
