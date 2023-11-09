import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("何人分のBMIを計算しますか？");
        int h = Integer.parseInt(scanner.nextLine());
        System.out.println(h + "人分の計算を実行します");

        double i = 0;
        double j = 0;
        double res = 0;
        double[] resList = new double[100];

        if (h != 1) {
            for (int count1 = 1; count1 <= h; count1++) {
                System.out.println(count1 + "人目の身長を入力してください。");
                i = scanner.nextDouble();

                System.out.println(count1 + "人目の体重を入力してください");
                j = scanner.nextDouble();

                i = i / 100;
                i = i * i;
                res = j / i;
                resList[count1] = res;
            }
            for (int count2 = 1; count2 <= h; count2++) {
                System.out.println("");
                System.out.println(count2 + "人目の計算結果です。");
                System.out.println("");
                if (resList[count2] > 40) {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("肥満(4度)");
                    System.out.println("標準値よりも高く肥満と判定されました。");
                    System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                    System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
                } else if (resList[count2] > 35) {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("肥満(3度)");
                    System.out.println("標準値よりも高く肥満と判定されました。");
                    System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                    System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
                } else if (resList[count2] > 30) {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("肥満(2度)");
                    System.out.println("標準値よりも高く肥満と判定されました。");
                    System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                    System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
                } else if (resList[count2] > 25) {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("肥満(1度)");
                    System.out.println("標準値よりも高く肥満と判定されました。");
                    System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                    System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
                } else if (resList[count2] > 18.5) {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("普通体重");
                    System.out.println("標準値の範囲内で、最も病気になりにくい状態であるといわれています。");
                    System.out.println("ただしBMIは身長と体重から単純に計算された値のため、これだけでは筋肉質なのか脂肪過多なのか区別することができません。");
                    System.out.println("脂質や糖質の多い食事を好む方や運動不足の方は隠れ脂肪肝の可能性があります。この機会に生活習慣を見直してみましょう。");
                } else {
                    System.out.println(String.format("%.2f", resList[count2]));
                    System.out.println("低体重");
                    System.out.println("標準値よりも低く痩せていると判定されました。");
                    System.out.println("BMIが18.4以下の場合、死亡リスクの上昇や栄養不良などが生じることがあるためバランスの良い食事と適度な運動を心がけましょう。");
                }
            }
        } else {
            System.out.println("身長を入力してください。");
            i = scanner.nextDouble();

            System.out.println("体重を入力してください");
            j = scanner.nextDouble();
            i = i / 100;
            i = i * i;
            res = j / i;

            if (res > 40) {
                System.out.println(String.format("%.2f", res));
                System.out.println("肥満(4度)");
                System.out.println("標準値よりも高く肥満と判定されました。");
                System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
            } else if (res > 35) {
                System.out.println(String.format("%.2f", res));
                System.out.println("肥満(3度)");
                System.out.println("標準値よりも高く肥満と判定されました。");
                System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
            } else if (res > 30) {
                System.out.println(String.format("%.2f", res));
                System.out.println("肥満(2度)");
                System.out.println("標準値よりも高く肥満と判定されました。");
                System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
            } else if (res > 25) {
                System.out.println(String.format("%.2f", res));
                System.out.println("肥満(1度)");
                System.out.println("標準値よりも高く肥満と判定されました。");
                System.out.println("脂質異常症、糖尿病、高血圧症など生活習慣病のリスクが高くなるため、");
                System.out.println("BMIが標準値の範囲になるよう食生活を見直し運動する習慣をつけましょう。");
            } else if (res > 18.5) {
                System.out.println(String.format("%.2f", res));
                System.out.println("普通体重");
                System.out.println("標準値の範囲内で、最も病気になりにくい状態であるといわれています。");
                System.out.println("ただしBMIは身長と体重から単純に計算された値のため、これだけでは筋肉質なのか脂肪過多なのか区別することができません。");
                System.out.println("脂質や糖質の多い食事を好む方や運動不足の方は隠れ脂肪肝の可能性があります。この機会に生活習慣を見直してみましょう。");
            } else {
                System.out.println(String.format("%.2f", res));
                System.out.println("低体重");
                System.out.println("標準値よりも低く痩せていると判定されました。");
                System.out.println("BMIが18.4以下の場合、死亡リスクの上昇や栄養不良などが生じることがあるためバランスの良い食事と適度な運動を心がけましょう。");
            }
        }
    }
}
