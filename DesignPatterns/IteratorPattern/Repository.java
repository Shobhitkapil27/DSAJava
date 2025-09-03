package DesignPattern.IteratorPattern;

public class Repository implements Aggregator<String>{

    private String[] names={"aman","shobhit","Sudhanshu","Anshita"};

    @Override
    public Iterator<String> createIterator() {
        return new nameIterator();
    }

    public class nameIterator implements Iterator<String>{

        private int pointer=0;
        @Override
        public boolean hasNext() {
          return pointer<names.length;
        }

        @Override
        public String next() {
            return hasNext()?names[pointer++]:null;
        }
    }
}
