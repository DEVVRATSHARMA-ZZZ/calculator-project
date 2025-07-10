package Methods;


public class operations {
   public double a ;
   public double b ;
   public double result;
   public String operation ;

    public double op() {
        switch (operation) {
            case "add":
                result = a + b;
                break;

            case "sub":
                result = a - b;
                break;
            case "div":
                result = a / b;
                break;
            case "mul":
                result = a * b;
                break;
            case "per":
                result = (a / 100) * b;
                break;
        }
        return result;      
    };
}
