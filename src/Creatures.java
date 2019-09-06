import java.util.Scanner;

public class Creatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Create Scanner key
        String mall;
        String shop;
        String mansion;
        String mill;
        String school;


        String mansion = keyboard.nextLine();
        String mill = keyboard.nextLine();
        String school = keyboard.nextLine();
        System.out.println("Welcome to Javatowne Village! A small community filled with friendly people but also strange creatures. " +
                "One of these creatures has escaped the Oddities Museum but you decide to visit anyway.");
        System.out.println("You spot the Spikey Slimemonster and decide to run. " + "Do you to go to the 1.) JavaTowne Mall, 2. Ice Cream Shop, 3. 18th Century Mansion, 4. Saw Mill, or 5. Elementary School? Choose a number.");
//        String input

        String bstalls = keyboard.nextLine();
        String bdefend = keyboard.nextLine();
        String ehelp = null;
        String ibdefend = null;
        String exit = null;
        String fd = null;
        String icrhelp = null;

        mall = keyboard.nextLine();
        if (mall.equals("1")) {
            System.out.println("Quick you have to choose between running to the mall food court to your (left) or the movie theater to your (right).");
            String food = keyboard.nextLine();
            if (food.equals("left")) {
                System.out.println("Now you are in the food court. Your stomach growls but you need to run! Do you head for the back door (exit) or the (bathroom)?");
                String fcbathroom = keyboard.nextLine();
                String foodexit = keyboard.nextLine();

                if (fcbathroom.equals("bathroom")) {
                    System.out.println("You can choose to go to the (stalls) or (defend) yourself.");


                }else if (fcstalls.equals("stalls")) {
                    System.out.println("You run to the stalls and wait for help. You are eventually rescued. Hurray!");}
//                } else if (fcbathroom.equals("defend")) {
                    System.out.println("You try to defend yourself against the creature. You lose. You die a tragic death.");
                }String fcexit = keyboard.nextLine();

                if (fcexit.equals("exit")) {
                    System.out.println("You find the exit and run down the hall do you (defend) yourself or call for (help)?");
                    ehelp = keyboard.nextLine();
                } else if (ehelp.equals("help")) {
                    System.out.println("You call for help. Big Jim rescues you. Hurray!");
                } else
                    System.out.println("You try to defend yourself. You lose the battle. You die. Game over.");
            } else if (fd.equals("right")) {
                System.out.println("You enter the movie theater. Do you go to the projection (room) or behind the movie (screen)?");
                String fdroom = keyboard.nextLine();
                String fdscreen = keyboard.nextLine();
                if (fdroom.equals("room")) {
                    System.out.println("You jump out the window and run for cover. Do you call for (help) or (wait) to run to your car. ");
                    String fdrhelp = keyboard.nextLine();
                    if (fdrhelp.equals("help")) {
                        System.out.println("You call for help. Big Jim finds you. You survived!");
                    } else
                        System.out.println("You decide to wait it out. The creature is captured and you survive. Hurray!");
                } else if (fdscreen.equals("screen")) {
                    System.out.println("You run behind the screen. There are objects to (defend) yourself or back door (exit)?");
                    String sexit = keyboard.nextLine();
                    String sdefend = keyboard.nextLine();
                    if (sexit.equals("exit")) {
                        System.out.println("You run out the back door. You see your car in the distance. You start the car and survive! Hurray!");
                    } else
                        System.out.println("You try to defend yourself but the creature is too strong. You die. Game over.");
                }

            } else if (shop.equals("2")) {
                System.out.println("You go into the Ice Cream Shop. The sweet smell attracted you but also may attract the creature. Where to hide inventory (room) or (restrooms)?");
                String sroom = keyboard.nextLine();
                String icrestroom = keyboard.nextLine();
                if (sroom.equals("room")) {
                    System.out.println("You enter the inventory room. Do you hide behind the (boxes) or (defend) yourself?");
                    String boxes = keyboard.nextLine();
                    if (boxes.equals("boxes")) {
                        System.out.println("You hide behind the boxes and notice metal scoops and small opening to the outside. Do you (defend) yourself or go (out)?");
                        ibdefend = keyboard.nextLine();
                    } else if (ibdefend.equals("defend")) {
                        System.out.println("You try to defend yourself with the scoops and lose. You died. Game over.");
                    } else
                        System.out.println("You go out the tiny opening to the outside and barely make it out. Big Jim sees and rescues you. Hurray! Game Over.");
                } else if (icrestroom.equals("restrooms")) {
                    System.out.println("You go to the men's room and have to decide to hide in the (stalls) or (defend) yourself.");
                    String icrhide = keyboard.nextLine();

                    if (icrhide.equals("stalls")) {
                        System.out.println("You hide in the stalls and can either (call) for help or (defend) yourself.");
                        icrhelp = keyboard.nextLine();
                    }else if (icrhelp.equals("call")) {
                        System.out.println("You call for help and Big Jim rescues you. You are safe! Game Over.");
                    } else
                        System.out.println("You try to defend yourself but the creature is too strong. You die. Game Over.");
                }
            }

        }
    }
//            else if(choice1.equals("3"))
//
//    {
//        System.out.println("You took your chances on the 18th Century Mansion. Hopefully the creature is too slow to catch you. Do you go (upstairs) or (downstairs) in the mansion?");
//    }
//            else if(choice1.equals("4"))
//
//    {
//        System.out.println("The Saw Mill looks abandoned but full of tools. Where do you go inside, (the large saw) or under a pile of sawdust in the (back)");
//    }
//            else if(choice1.equals("5"))
//
//    {
//        System.out.println("You aren't too cool for school. Where do you to inside, (principal's office) or (cafeteria)?");
//    }
//}

//            }
////}
