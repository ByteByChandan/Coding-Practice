class Animals {
    Animals() {
        System.out.println("It has four legs");
    }
}

class DogeshBhai extends Animals {
    DogeshBhai() {
        System.out.println("It comes in multiple colors: brown, black, white...");
    }
}

class inherit_ance {
    public static void main(String[] args) {
        DogeshBhai obj = new DogeshBhai();
    }
}
