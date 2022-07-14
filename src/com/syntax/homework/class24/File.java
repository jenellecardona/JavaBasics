package com.syntax.homework.class24;

public abstract class File {

    abstract void open();
    void edit(){
        System.out.println("edit document");
    }
    void close(){
        System.out.println("close document");
    }

    public static void main(String[] args) {
        File[] files={new JavaFile(),new Wordfile(),new PdfFile()};

        for(File f:files){
            f.open();
        }
    }

}
class JavaFile extends File{

    @Override
    void open() {
        System.out.println("opens Java file");
    }
}

class Wordfile extends File{

    @Override
    void open() {
        System.out.println("opens Word file");
    }
}

class PdfFile extends File{

    @Override
    void open() {
        System.out.println("opens PDF file");
    }
}

