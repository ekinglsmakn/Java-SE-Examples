package StringExamples;

public class GetBytesMethod {
    /*
    * getBytes: String ifadeyi karakter karakter byte dizisine çevirir. Ascii karşılıkları ile bir dizi oluşturur
    * L:76
    * o:111
    * r:114
    * d:100
    * */
    public static void main(String[] args) {
        String str = "Lord Of The Rings";
        byte [] byteArray = str.getBytes();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(i +". element is: " +byteArray[i]);
        }
    }
}
