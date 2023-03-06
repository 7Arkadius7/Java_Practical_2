public class Practical_2_Task_1 {

    public static void main(String[] args) {
        StringBuilder targetStr = new StringBuilder();
        String[] jsStr = { "name:Ivanov", "country:Russia", "city:Moscow", "age:null" };
        int len = jsStr.length;
        for (int i = 0; i < len; i++) {
            if (jsStr[i].indexOf("null") == (-1)) {
                targetStr.append(jsStr[i].replace(":", "="));
                if (i != len - 2) {
                    targetStr.append(" AND ");
                }
            }
        }
        System.out.println("Часть Where вашего запроса имеет вид: "+targetStr);
    }
}