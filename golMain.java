//Evaan J
//Jan .12
//Game of life

import java.util.Scanner;

public class golMain  {

    
    public static Scanner scanner1 = new Scanner (System.in);
    
    public void enter (){

        System.out.println("Welcome");  
    }
    public int rowInput(int r ){
    
        int x; 
        
        //Creatign a do - while loop to loop code under a circumstance
        do{
            x=0;
            
            //Adding try catch to catch invalid input by the user
            try{ 
                System.out.println("choose a number of rows") ;
               

                //Setting the scanner equal to a int so it can be used later on in the code
                r =  scanner1.nextInt();
            
            //Making changes if invalid user input is given
            }catch(Exception e){
                System.out.println("Invalid input, please try again");
                x=1;
                scanner1.next();
            }
        }while(x==1);
        //Having a return statement
        return r;
        
    }
    public int columnInput(int c ){
        
        int x; 
        do{
            x=0;
            try{
                System.out.println("choose a number of columns");
                c = scanner1.nextInt();
            }catch(Exception e){
                System.out.println("Invalid input, please try again");
                x=1;
                scanner1.next();
            }
        }while(x==1);
        return c;
    }
    public int numOrganisms (int o){
        
        int x; 
        do{
            x=0;
            try{
                System.out.println("organisms");
                o = scanner1.nextInt();
            }catch(Exception e){
                System.out.println("Invalid input, please try again");
                x=1;
                scanner1.next();
            }
        }while(x==1);
        return o;
    }
    public boolean [][]create(int rowC,int colC, int n, boolean cor2[][]){
        
        cor2 = new boolean [rowC][colC];
      
        for(int w=0; w<n ; w++){
            int x; 
            do{
                x=0;
                try{
                    System.out.println("What is the row of organism " + (1+w) +" ?");
                    int rowUpdate = scanner1.nextInt();

                    System.out.println("What is the column of organism " + (1+w) +" ?");
                    int columnUpdate = scanner1.nextInt();

                    cor2[rowUpdate][columnUpdate] = true;

                }catch(Exception e){
                    System.out.println("Invalid input, please try again");
                    x=1;
                    scanner1.next();
                }
            }while(x==1);
        }
        return cor2;
    }
    public void print (int rowP,int colP, boolean cor3[][]){
        
        for(int w=0; w<rowP ; w++){
            for(int j=0; j<colP ; j++){

                //Printing out the column values of row "w"
                if(cor3 [w][j]){
                    System.out.print("*     ");
                }else {
                    System.out.print(".     ");
                }
            }
            System.out.println();
            System.out.println();
        } 
    }
    public int gen (int g){
        
        int x;
        do{
            x=0;
            try{
                System.out.println("How many generations would you like to see?");
                g = scanner1.nextInt();

            }catch(Exception e){
                System.out.println("Invalid input, please try again");
                x=1;
                scanner1.next();
            }
        }while(x==1);
        return g;
    }
    public boolean [][] future (boolean cor3[][], int row, int col){
        
        int c=0;
        
        int d=0;
        
        for(int p=0; p<row ; p++){
            for(int k=0; k<col ; k++){
                
                int h=0;
                for(int j=-1+p; j<2+p; j++){
                    for(int i=-1+k; i<2+k; i++){
                        try{
                            if (cor3[j][i]){
                                h++;
                            }
                        }catch(Exception e){
                            
                        }
                    }  
                } 

                if (cor3[p][k] && h==4){
                    cor3[p][k]=true;
                }else if (cor3[p][k] && h<3){
                    cor3[p][k]=false;
                }else if (cor3[p][k] && h>4){
                    cor3[p][k]=false;
                }else if (!cor3[p][k] && h==3){
                    cor3[p][k]=true;
                }else if (!cor3[p][k] && h<2){
                    cor3[p][k]=false;
                }else if (!cor3[p][k] && h>3){
                    cor3[p][k]=false;
                }
              
            }
        }
        return cor3;
        
    }
   
}
