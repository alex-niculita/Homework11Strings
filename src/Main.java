public class Main {
    public static void main(String[] args) {

        System.out.println("Task#1: Concatenate name");
        System.out.println("\tФИО сотрудника — " + task1());
        System.out.println();
        System.out.println("Task#2: To Upper Case");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + task2(task1()));
        System.out.println();
        System.out.println("Task#3 Replace letter");
        System.out.println("\tДанные ФИО сотрудника — " + task3("Иванов Семён Семёнович","ё","e"));

    }

    public static String task1(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName =  lastName +" "+ firstName +" "+ middleName;
        return fullName;
    }

    public static String task2(String name){
        return name.toUpperCase();
    }

    public static String task3(String name, String a, String b){
        if(name.contains("ё")){
            String[] strArr = name.split("");
            for (int i=0;i<strArr.length;i++){
                if (strArr[i].equals("ё")){
                    strArr[i] = "е";
                }
            }
            return String.join("", strArr);
        }

        return name;

//        return name.replace(a,b);    Or we could use replace method instead of FOR cycle

    }
}