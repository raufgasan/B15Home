package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Repl_170_Arrays_ZombieAttack2 {
    public static void main(String[] args) {
//
//        An array inhabitants represents cities and their respective populations. For example,
//        the following arrays shows 8 cities and their respective populations:
//              [3, 6, 0, 4, 3, 2, 7, 0]
//        Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
//        After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.
//
//                Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) to a
//                city with zero people until all cities have no humans left.
//
//                Make updates to each element in the array And print the array like below for each day:
//
//        Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
//        Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
//        Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
//        Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
//        Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
//        Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
//        ---- EXTINCT ----
//
//        Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.
//
//                Hint:
//        Below expression will print array in this format:
//
//[3, 6, 0, 4, 3, 2, 7, 0]
//
//        Code:
//        System.out.println(Arrays.toString(inhabitants)));


//        Scanner input = new Scanner(System.in);
//        int[] inhabitants = new int[8];
//        for(int i=0; i<inhabitants.length; i++) {
//            inhabitants[i] = input.nextInt();
//        }

        //TODO. Write you code below this line.
int []inhabitants = {10, 0, 20, 4, 0, 1, 6, 0};


        int days = 0;
        System.out.println("Day " + days + " " + Arrays.toString(inhabitants));

        int lon = inhabitants.length;
        int [] arr = new int[inhabitants.length];

       for (int i = 0; i <lon ; i++) {
           while (inhabitants[i]!=0) {
           for (int j = 0; j <inhabitants.length ; j++) {
               arr[j]=inhabitants[j];
           }

                  for (int x = 0; x < lon; x++) {


                      if (inhabitants[x]==0        &&          x!=0  ) {

                          inhabitants[x-1]=arr[x-1] / 2;

                      }
                      if (inhabitants[x]==0  &&         x<=6) {

                          inhabitants[x+1] =arr[x+1]/ 2;

                          x++;
                      }




//
//                      if (x==0&&inhabitants[x]==0&&inhabitants[2]!=0){
//                          inhabitants[x+1] /= 2;
//                      }if (x==inhabitants.length-1&&inhabitants[inhabitants.length-1]==0&&inhabitants[inhabitants.length-3]!=0){
//                          inhabitants[inhabitants.length-2]/= 2;
//                          break;
//                      }
//
//                    if(x>0&&x<inhabitants.length-1&&(inhabitants[x]==0      ||   inhabitants[inhabitants.length-2]==0)) {
//
//                          inhabitants[x+1] /= 2;
//
//                          inhabitants[x-1] /= 2;
//                          x++;
//                      }



            }

           days++;
           System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
       }

        }

        }



    }
//&&(x>=2&&inhabitants[x-2]==0)