/*package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args){
      try {
          String a;
          int x1, x2, z, z2,z3;
          Scanner a1 = new Scanner(System.in);
          a = a1.nextLine();
          x1 = a.indexOf(' ');
          x2 = a.lastIndexOf(' ');
          z  =  Integer.parseInt(a.substring(0,x1));
          z2 = Integer.parseInt(a.substring(x1+1, x2));
          z3 = Integer.parseInt(a.substring(x2+1));
          if((z+z2>z3)&&(z+z3>z2)&&(z2+z3>z)) System.out.println("TAK");
          else System.out.println("NIE");
      }catch(Exception e)
      {
          System.out.println("BŁĄD");
      }
    }
}

package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
                int x;

        try {

            Scanner s = new Scanner(System.in);
            x = s.nextInt();
            switch (x) {
                case 1 -> System.out.println("Styczeń: 31 dni");
                case 2 -> System.out.println("Luty: 28 dni");
                case 3 -> System.out.println("Marzec: 31 dni");
                case 4 -> System.out.println("Kwiecień: 30 dni");
                case 5 -> System.out.println("Maj: 31 dni");
                case 6 -> System.out.println("Czerwiec: 30 dni");
                case 7 -> System.out.println("Lipiec: 31 dni");
                case 8 -> System.out.println("Sierpień: 31 dni");
                case 9 -> System.out.println("Wrzesień: 30 dni");
                case 10 -> System.out.println("Październik: 31 dni");
                case 11 -> System.out.println("Listopad: 30 dni");
                case 12 -> System.out.println("Grudzień: 31 dni");
                default -> System.out.println("BŁĄD");
            }

        } catch (Exception e) {
            System.out.println("BŁĄD");
        }
    }

} */
/*
package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       try {
            float a[] = new float[3];
            Scanner s = new Scanner(System.in);
            a[0] = s.nextFloat();
            a[1] = s.nextFloat();
            a[2] = s.nextFloat();
           for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a.length - 1; j++) {
                   if (a[j] > a[j + 1]) {
                       float temp = a[j + 1];
                       a[j + 1] = a[j];
                       a[j] = temp;
                   }
               }
           }
           System.out.printf("%.6f", a[0]);
           System.out.printf(" ");
           System.out.printf("%.6f", a[1]);
           System.out.printf(" ");
           System.out.printf("%.6f", a[2]);
           System.out.printf("\n");
           System.out.printf("%.6f", a[2]);
           System.out.printf(" ");
           System.out.printf("%.6f", a[1]);
           System.out.printf(" ");
           System.out.printf("%.6f", a[0]);
           System.out.printf("\n");


           // System.out.println(a[0] + " " + a[1] + " " + a[2]);
            //System.out.println(a[2] + " " + a[1] + " " + a[0]);
       }
       catch(Exception e)
       {
            System.out.println("Błąd");
       }
    }
}*/
/*package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            int m, n, x;
            int wynik = 0;
            n = s.nextInt();
            m = s.nextInt();
            int A[] = new int[n];
            int B[] = new int[m];

            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }

            for (int i = 0; i < m; i++) {
                B[i] = s.nextInt();
            }

            if (m > n) x = n;
            else x = n;

            for (int i = 0; i < x; i++) {
                wynik = wynik + A[i] * B[i];
            }

            System.out.println(wynik);
        }
        catch(Exception e)
        {
            System.out.println("BŁĄD");
        }

    }
}*/
/*package com.company;
import java.util.*;

public class Main {

    public static void triangle(int x)
    {
        for(int i = 1; i<=x; i++)
        {
            for(int j = 1; j <= i;j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void reversedTriangle(int x)
    {
        for(int i = x; i>=1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    public static void triangle2(int x)
    {
        for(int i = 1; i<=x; i++)
        {
            for(int j = 1; j <= x-i;j++)
            {
                System.out.printf(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public static void reversedTriangle2(int x)
    {
        for(int i = 1; i<=x; i++)
        {
            for(int j = 1; j <= i - 1;j++)
            {
                System.out.printf(" ");
            }
            for(int j = 0; j < x-i+1; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        int ile;
        while(true)
        {
            Scanner s = new Scanner(System.in);
            try
            {
                ile = s.nextInt();
            }
            catch (Exception e)
            {
                ile = s.nextInt();
            }
            if(ile < 0) ile = s.nextInt();
            try
            {
                triangle(ile);
                reversedTriangle(ile);
                reversedTriangle2(ile);
                triangle2(ile);
                return;
            }
            catch(Exception o)
            {
                continue;
            }
        }
    }
}*/
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        String linia;
        char Tab[];
        try
        {
            Scanner s = new Scanner(System.in);
            linia = s.nextLine();
            Tab = linia.toCharArray();
            //bez stałej wielkosci tablicy by było łatwiej
            //System.out.println(Tab.length);
            int helpMe = Tab.length/2;
            boolean czyJestP = true;
            int dl = Tab.length;
            for(int i = 0; i < helpMe;i++)
            {
                //System.out.println(i);
                if(Tab[i]!=Tab[dl-i-1])
                {
                    //System.out.println(Tab[i]);
                    czyJestP=false;
                }
            }

            if(czyJestP) System.out.println("TAK");
            else System.out.println("NIE");

        }
        catch (Exception e)
        {

        }
    }
}*/
/*package com.company;
import java.util.*;

public class Main {
    public static int Tab[][];
    public static int tran[][];
    public static void writeMatrix(int x, int y, Scanner s)//x=a y=b
    {
        for(int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                Tab[i][j] = s.nextInt();
            }
        }
    }

    public static void readMatrix(int x, int y)
    {
        int temp;
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                temp = tran[i][j];
                System.out.print(temp);
                if(j!=y-1) System.out.print(" ");
            }
            System.out.printf("\n");
        }
    }
    public static int[][] transMatrix(int x, int y)
    {
        int trans[][] = new int[y][x];
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                trans[j][i] = Tab[i][j];
            }
        }
        return trans;
    }

    public static void main(String[] args) {
               Scanner s = new Scanner(System.in);
               int a, b;
               a = s.nextInt();
               b = s.nextInt();
               Tab = new int[a][b];
               writeMatrix(a,b,s);
               tran = transMatrix(a,b);
               readMatrix(b,a);

    }
}*/
/*package com.company;
import java.util.*;

public class Main {

    public static Boolean czyJest(char m, String l)
    {
        l = l.toLowerCase();
        if(l.indexOf(m)==-1) return false;
        else return true;
    }

    public static void main(String[] args) {
            try
            {
                Scanner s = new Scanner(System.in);
                String napis;
                napis = s.nextLine();
                char matryca[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                Boolean jezd = true;
                char temp;
                for(int i = 0; i<26;i++)
                {
                    if(!czyJest(matryca[i], napis))
                    {
                        System.out.println("false"); return;
                    }
                }
                System.out.println("true");
            }
            catch(Exception e)
            {

            }
    }
}*/
package com.company;

import java.util.Scanner;

public class Main {
    public static int partition(int arr[], int start, int end)
    {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] <= pivot)
                count++;
        }
        int pivotIndex = start + count;
        int temp;
        temp = arr[pivotIndex];
        arr[pivotIndex] = arr[start];
        arr[start] = temp;
        int i = start, j = end;
        while (i < pivotIndex && j > pivotIndex) {

            while (arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                temp = arr[i++];
                arr[i++] = arr[j--];
                arr[j--] = temp;
            }
        }
        return pivotIndex;
    }

    public static int max_rec(int[] arr, int start, int end)
    {
        if (start >= end) return arr[arr.length-1];
        int p = partition(arr, start, end);
        max_rec(arr, start, p - 1);
        max_rec(arr, p + 1, end);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int i = 0;
             int tab[] = new int[1000000000];
            String linia = s.nextLine();
            linia.replaceAll(" ", "=" );
            while(linia.indexOf("=")!=-1)
            {
                System.out.println(i);
                tab[i] = Integer.parseInt(linia.substring(0,linia.indexOf("=")-1));
                linia = linia.substring(linia.indexOf("=")+1);
                i++;
            }
            i++;
            int arr[] = new int[i];
            for(int j = 0; j < i; j++)
            {
                arr[j] = tab[j];
            }
            System.out.println(max_rec(arr, 0 , i-1));
    }
}
