class Main {
  public static void main(String[] args) {
   //ARRAYS
    //Single Dimensional Array in Java
    int a[] = new int[5];//declaration &instantiation
    a[0] = 10;//initialization
    a[1] = 20;
    a[2] = 30;
    a[3] = 40;
    a[4] = 50;

    //traversing through the array

    for(int i = 0; i < a.length; i++){
      System.out.println(a[i]);
    }
   System.out.println();
    int b[] = new int[7];
    b[0] = 20;
    b[1] = 40;
    b[2] = 60;
    b[3] = 80;
    b[4] = 100;
    b[5] = 120;
    b[6] = 140;

    for(int i = 0; i < b.length; i++){
      System.out.println(b[i]);
    }

System.out.println();
    
//Declaration, Instantiation and Initialization of Java Array

    ////Java Program to illustrate the use of declaration, instantiation   
//and initialization of Java array in a single line  

    int c[] = {10,40,80,60};//declaration, instantiation and initialization  

    //printing array
    for(int i = 0; i < c.length; i++){
      System.out.println(c[i]);
    }

    System.out.println();

    //For-each Loop for Java Array

    int d[] = {30,48,50,80,90};

    for(int i : d){
      System.out.println(i);
    }

    //Passing Array to a Method in Java

    System.out.println();
    int e[] = {30,2,5,6};//declaring and initializing an array  
    min(e);//passing array to method

    System.out.println();

   //Example of Multidimensional Java Array
    int f[][] = {{39,45,67,7},{49,50,35},{45,56,4,5}};
    //printing 2d array
    
    for(int i = 0; i < 3; i++){
      for(int j = 0; j <3; j++){
        System.out.println(f[i][j]);
      }
    }
    System.out.println();


    int g[][] = {{346,46,474,48},{3,6,73}};
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
        System.out.println(g[i][j]);
      }
    }

    
 

    

    
  }
static void min(int arr[]){
    int min = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(min>arr[i]){
        min=arr[i];

       System.out.println(arr[i]); 
        
      }
      
    }
  }
}