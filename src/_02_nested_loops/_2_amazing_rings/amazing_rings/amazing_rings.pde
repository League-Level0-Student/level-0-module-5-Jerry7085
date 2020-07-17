
int x = 300;
int y = 400;
int z = 900;
int a = 400;
void setup() {
  size(1200,800);
}

void draw() {
  if(mousePressed){
    background(-1);
    x = x+2;
    z = z-2;
  }
  for (int i = 600; i > 5; i-=10) {
  noFill();
    ellipse(x,y,i,i);
    ellipse(z,a,i,i);
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
}
