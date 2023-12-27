package org.example;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\": \"noda\", \"age\": 66, \"Number\": [2, 4, 6]}";
        System.out.println(json);
        String json2 = "{\"total\":3,\n" +
                       "\"cities\":[\n" +
                       "{\n" +
                       "\"Number\":1,\n" +
                       "\"Prefecture\":\"Kanagawa\",\n" +
                       "\"Capital\":\"Yokohama\"\n" +
                       "},\n" +
                       "{\n" +
                       "\"Number\":2,\n" +
                       "\"Prefecture\":\"Aichi\",\n" +
                       "\"Capital\":\"Nagoya\"\n" +
                       "},\n" +
                       "{\n" +
                       "\"Number\":3,\n" +
                       "\"Prefecture\":\"Hyogo\",\n" +
                       "\"Capital\":\"Kobe\"\n" +
                       "}\n" +
                       "]}";
        System.out.println(json2);

    }

}
