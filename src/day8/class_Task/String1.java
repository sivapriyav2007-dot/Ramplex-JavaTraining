package day8.class_Task;

class Strings {
    public static void main(String []args){
        String name="Sivapriya";
        String name1=new String("Sivapriya");
        int n=name.length();
        for(int i=n-1;i>=0;i++){
            System.out.print(name.charAt(i));
        }
    }
}
