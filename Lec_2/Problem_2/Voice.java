class Voice {
    void prepareVoice(){
        Animal[] animals = new Animal[5];
        
      animals[0] = new Cow();
       animals[1] = new Dog();
        animals[2] = new Goat();
         animals[3] = new Pig();
          animals[4] = new Lion();
          hear(animals);
    }
     void hear(Animal[] animals){
         for(int i =0; i<5; i++){
             animals[i].MakeVoice();
         }
    
   
    }
}