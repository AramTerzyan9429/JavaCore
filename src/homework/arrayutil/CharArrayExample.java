package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e',};

        //1)քանի հատ կա c-փոփոխականից մասիվի մեջ
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);

        //2)կտպի մեջտեղի 2 սինվելները
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars2[chars.length / 2 - 1] + "," + chars2[chars.length / 2]);

        //3)պետք է տպել True, եթե մասիվե վերջանում է 'l','y'-ով ,եթե ոչ False
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //4)կտպի True,եթե տեքստը պարունակում է BOB բառը ,բայց 0-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                System.out.println(true);
            }
        }

        //4)boolean-Տարբերակով
        char[] bobArray1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean b = false;
        for (int i = 0; i < bobArray1.length; i++) {
            if (bobArray1[i] == 'b' && bobArray1[i + 2] == 'b') {
                System.out.println(true);

            }


            //5)տպել մասիվի այն սինվոլները ,որոնք պռաբել չեն։
            char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ',};
            for (int i1 = 0; i < text.length; i++) {
                if (text[i] != ' ') {
                    System.out.print(text[i] + ",");
                }
            }
        }
    }
}
