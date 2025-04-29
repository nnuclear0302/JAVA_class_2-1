// Device 클래스 정의 (추상 클래스)
abstract class Device {
    abstract void volumeUp();
    abstract void volumeDown();
    abstract void changeChannel();
}

// TV 클래스 정의 (Device를 상속)
class TV extends Device {
    @Override
    void volumeUp() {
        System.out.println("TV소리 키움");
    }

    @Override
    void volumeDown() {
        System.out.println("TV소리 줄임");
    }

    @Override
    void changeChannel() {
        System.out.println("TV채널변경");
    }
}

// Radio 클래스 정의 (Device를 상속)
class Radio extends Device {
    @Override
    void volumeUp() {
        System.out.println("라디오 소리 키움");
    }

    @Override
    void volumeDown() {
        System.out.println("라디오 소리 줄임");
    }

    @Override
    void changeChannel() {
        System.out.println("라디오 채널변경");
    }
}

// Remote 클래스 정의
class Remote {
    private Device device;

    // Device 객체를 Remote에 연결하는 생성자
    Remote(Device device) {
        this.device = device;
    }

    void volumeUp() {
        device.volumeUp();
    }

    void volumeDown() {
        device.volumeDown();
    }

    void changeChannel() {
        device.changeChannel();
    }
}

// 테스트 코드
public class Remocon {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Remote tvRemote = new Remote(tv);
        Remote radioRemote = new Remote(radio);

        tvRemote.volumeUp();       // 출력: TV소리 키움
        tvRemote.volumeDown();     // 출력: TV소리 줄임
        tvRemote.changeChannel();  // 출력: TV채널변경

        radioRemote.volumeUp();    // 출력: 라디오 소리 키움
        radioRemote.volumeDown();  // 출력: 라디오 소리 줄임
        radioRemote.changeChannel(); // 출력: 라디오 채널변경
    }
}

