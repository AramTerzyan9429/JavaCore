package homework.arrayutil;

public class ArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
/*Ուղարկում եմ գործնական անելու տնայինը։ arrayUtil package-ի մեջ սարքում եք CharArrayExample կլասսը, և լուծում խնդիրները՝
1) Ունենք հետևյալ մասիվը՝
char[] chars = {'j','a','v','a','l,'o','v', 'e'};
ունենք նաև մի սինվոլ՝ char c = 'o';
Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
2) Ունենք հետևյալ մասիվը՝
char[] chars2 = {'j','a','v','a','l,'o','v', 'e'};
պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
3) Ունենք հետևյալ մասիվը՝՝
char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
4) Ունենք հետևյալ մասիվը՝
char[] bobArray = {'b','a',b','o','l','a'};
//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
//օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
5) Ունենք հետևյալ մասիվը՝
char[] text = {' ',' ','b','a','r','e','v',' ',' '};
պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.
Առայժմ այսքանը։*/


        //1) Ունենք հետևյալ մասիվը՝
        //char[] chars = {'j','a','v','a','l,'o','v', 'e'};
        //ունենք նաև մի սինվոլ՝ char c = 'o';
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։

        char c = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.print(count);


        //2) Ունենք հետևյալ մասիվը՝
        //char[] chars2 = {'j','a','v','a','l,'o','v', 'e'};
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։

        System.out.println();
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.print(chars2[chars.length / 2 - 1] + "," + chars2[chars.length / 2]);
        System.out.println();


        //3) Ունենք հետևյալ մասիվը՝՝
        //char[] chars3 = {'j','a','v','a','l,'o','l', 'y'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //4)Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println(true);
            }
        }


        //5) //պետք է տպել մասիվի այն սինվոլները որոնք պռաբել չեն.

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + ",");

            }
        }

        System.out.println();

        //4)Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        boolean b =false;
        char[] bobArray1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray1.length; i++) {
            if (bobArray1[i]=='b'&& bobArray1[i+2]=='b'){
                b=true;
            }

        }
        System.out.println(b);

    }
}