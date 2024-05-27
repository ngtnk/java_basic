public class Main1504 {
    public static void main(String[] args) {
        try {
            processFile(null);
        } catch (CheckedEx e) {
            System.err.println("チェックされる例外発生: " + e.getMessage());
        }

        causeUncheckedException();
    }

    public static void processFile(String file) throws CheckedEx {
        if (file == null) {
            // Checked例外についてはエラーハンドリングを書かないとコンパイルエラーになる
            throw new CheckedEx("ファイル名がnullです");
        }
        System.out.println("ファイル処理完了: " + file);
    }

    // こいつはUnchecked例外を吐くのでエラーハンドリングを書かなくても「コンパイルは」通る
    public static void causeUncheckedException() {
        int[] numbers = { 1, 2, 3 };
        int num = numbers[5];
        System.out.println("数値: " + num);
    }
}

class CheckedEx extends Exception {
    public CheckedEx(String message) {
        super(message);
    }
}