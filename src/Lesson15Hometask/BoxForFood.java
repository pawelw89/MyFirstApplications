package Lesson15Hometask;

public class BoxForFood <F>{

        private F Food;

        public BoxForFood(F food) {
            this.Food = food;
        }

        F getItem() {
            return Food;
        }
}
