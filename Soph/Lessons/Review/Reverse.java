int start = 0;
int end = arr.length-1;

while(start < end){
  int temp = arr[start];
  arr[start] = arr[end];
  arr[end] = temp;
  start++;
  end--;
}

//output
System.out.println("\nArray: ");
for(int i = 0; i < arr.length; i++){
  System.out.print(arr[i] + " ");
}
