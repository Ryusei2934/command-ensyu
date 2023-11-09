import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("身長を入力してください。");
        double i = scanner.nextDouble();
        i = i /100;
        i = i * i;
        System.out.println("体重を入力してください");
        double j = scanner.nextDouble();

        double res = j/i;

        if (res > 40) {
            System.out.println(String.format("%.2f",res));
            System.out.println("肥満(4度)");
            System.out.println("標準値よりも高く肥満と判定されました。");
            System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
            System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
        }else if (res > 35) {   
            System.out.println(String.format("%.2f",res));
            System.out.println("肥満(3度)");
            System.out.println("標準値よりも高く肥満と判定されました。");
            System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
            System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
        }else if (res > 30){
            System.out.println(String.format("%.2f",res));
            System.out.println("肥満(2度)");
            System.out.println("標準値よりも高く肥満と判定されました。");
            System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
            System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
        }else if (res > 25) {
            System.out.println(String.format("%.2f",res));
            System.out.println("肥満(1度)");
            System.out.println("標準値よりも高く肥満と判定されました。");
            System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
            System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
        }else if (res > 18.5){
            System.out.println(String.format("%.2f",res));
            System.out.println("普通体重");
            System.out.println("標準値の範囲内で、最も病気になりにくい状態であるといわれています。");
            System.out.println("ただしBMIは身長と体重から単純に計算された値のため、これだけでは筋肉質なのか脂肪過多なのか区別することができません。");
            System.out.println("脂質や糖質の多い食事を好む方や運動不足の方は隠れ脂肪肝の可能性があります。この機会に生活習慣を見直してみましょう。");
        }else{
            System.out.println(String.format("%.2f",res));
            System.out.println("低体重");
            System.out.println(	"標準値よりも低く痩せていると判定されました。");
            System.out.println("BMIが18.4以下の場合、死亡リスクの上昇や栄養不良などが生じることがあるためバランスの良い食事と適度な運動を心がけましょう。");
        }
    }
}