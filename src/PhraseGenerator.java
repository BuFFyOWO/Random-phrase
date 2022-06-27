public class PhraseGenerator {
    public static void main(String[] args) {
        String[] one = {"умный", "ненавязчивый", "на основе веб-технологий", "динамичный", "проникающий", "обоюдный выигрыш", "на основе веб-технологий", "метод критического пути"};
        String[] two = {"сфокусированный", "ориентированный", "сетевой", "общий", "совместный", "использованный с выгодой", "нестандартный ум", "выровненный", "фирменный"};
        String[] three = {"процесс", "подход", "образец", "обзор", "тип структуры", "пункт следования", "период времени" ,"пункт разгрузки", "портал"};

        int oneLenght = one.length;
        int twoLenght = two.length;
        int threeLenght = three.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String Phrase = one[rand1] + " " + two[rand2] + " " + three[rand3];

        System.out.println("Всё, что вам необходимо, так это:"+ " " + Phrase);
    }
}
