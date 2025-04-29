import java.util.Vector;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NameEx {
    public static void main(String[] args) {
        Vector<String> nameVector = new Vector<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n=== 학생 관리 시스템 ===");
                System.out.println("1. 학생 추가");
                System.out.println("2. 학생 검색");
                System.out.println("3. 학생 삭제");
                System.out.println("4. 종료");
                System.out.print("옵션을 선택하십시오 (1-4): ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // 버퍼 비우기

                switch (choice) {
                    case 1 -> {
                        System.out.print("추가할 학생 이름: ");
                        String name = scanner.nextLine().trim();
                        if (name.isEmpty()) {
                            System.out.println("오류: 이름이 비어있습니다.");
                            continue;
                        }
                        if (nameVector.contains(name)) {
                            System.out.println("오류: '" + name + "' 학생은 이미 등록되어 있습니다.");
                            continue;
                        }
                        nameVector.add(name);
                        System.out.println("'" + name + "' 학생이 추가되었습니다.");
                    }
                    case 2 -> {
                        if (nameVector.isEmpty()) {
                            System.out.println("등록된 학생이 없습니다.");
                            continue;
                        }
                        System.out.print("검색할 학생 이름: ");
                        String name = scanner.nextLine().trim();
                        int index = nameVector.indexOf(name);
                        if (index != -1) {
                            System.out.println("'" + name + "' 학생은 " + (index + 1) + "번째 위치에 있습니다.");
                        } else {
                            System.out.println("'" + name + "' 학생을 찾을 수 없습니다.");
                        }
                    }
                    case 3 -> {
                        if (nameVector.isEmpty()) {
                            System.out.println("등록된 학생이 없습니다.");
                            continue;
                        }
                        System.out.print("삭제할 학생 이름: ");
                        String name = scanner.nextLine().trim();
                        if (nameVector.remove(name)) {
                            System.out.println("'" + name + "' 학생이 삭제되었습니다.");
                        } else {
                            System.out.println("'" + name + "' 학생을 찾을 수 없습니다.");
                        }
                    }
                    case 4 -> {
                        System.out.println("프로그램을 종료합니다...");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("오류: 1에서 4 사이의 숫자를 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("오류: 올바른 숫자를 입력해주세요.");
                scanner.nextLine(); // 잘못된 입력 비우기
            }
        }
    }
}