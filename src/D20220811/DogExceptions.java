package D20220811;

public class DogExceptions {
        String name;
        boolean isCollarPutOn;
        boolean isLeashPutOn;
        boolean isMuzzlePutOn;

    public DogExceptions(String name) {
        this.name = name;
    }



        public static void main(String[] args) throws DogIsNotReadyException {
            DogExceptions dog1 = new DogExceptions("Puf1");
            dog1.putCollar();

            dog1.putMuzzle();
            try {
                dog1.walk();
            } catch (DogIsNotReadyException e) {
                System.out.println(e.getMessage());
                System.out.println("Проверяем снаряжение! Ошейник надет? " + dog1.isCollarPutOn + "\r\n Поводок надет? "
                        + dog1.isLeashPutOn + "\r\n Намордник надет? " + dog1.isMuzzlePutOn);
            }

        }

        public void putCollar() {

            System.out.println("Ошейник надет!");
            this.isCollarPutOn = true;
        }

        public void putLeash() {

            System.out.println("Поводок надет!");
            this.isLeashPutOn = true;
        }

        public void putMuzzle() {
            System.out.println("Намордник надет!");
            this.isMuzzlePutOn = true;
        }

        public void walk() throws DogIsNotReadyException {

            System.out.println("Собираемся на прогулку!");
            if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
                System.out.println("Ура, идем гулять! " + name + " очень рад!");
            } else {
                throw new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
            }
        }
    public class DogIsNotReadyException extends Exception {

        public DogIsNotReadyException(String message) {
            super(message);
        }
    }

    }
