
//Hecho por Daniel Fernando Gonzalez Cortes
// Dia: 13/05/2023
// tomado de https://www.youtube.com/watch?v=aP-Jcdwqrz0 tutorial y modificado por Daniel Gonzalez

import java.awt.Color; // Color de la ventana
import java.awt.Graphics; // Dibujar en la ventana
import java.awt.event.*; // Eventos de teclado
import java.awt.Toolkit;    // Para centrar la ventana
import java.awt.Dimension; // Para centrar la ventana
import java.awt.Point; // Para las posiciones
import java.awt.Font; // Para las fuentes

import javax.swing.JFrame; // Ventana del juego
import javax.swing.JPanel; // Panel de la ventana

import java.util.ArrayList; // Lista de posiciones
import java.util.Random; // Generar numeros aleatorios para la comida


public class Snake extends JFrame { // Clase principal del juego
    
    ImagenSnake imagenSnake;
    Point snake;
    //Point lastSnake;
    Point comida;
    ArrayList<Point> listaPosiciones = new ArrayList<Point>(); // Lista de posiciones de la serpiente

    int longitud = 2; // Longitud de la serpiente

    int width = 640; // Ancho de la ventana
    int height = 480; // Alto de la ventana

    int widthPoint = 10; // Ancho de la serpiente
    int heightPoint = 10; // Alto de la serpiente

	String direccion = "RIGHT"; // Direccion de la serpiente
	long frequency = 50; // Frecuencia de actualizacion de la ventana

    boolean gameOver = false; // Bandera para saber si el juego termino

    public Snake() {
		setTitle("Snake");

        startGame(); // Iniciar el juego
        imagenSnake = new ImagenSnake(); 

        this.getContentPane().add(imagenSnake);

		setSize(width,height); // Tamaño de la ventana
		
		this.addKeyListener(new Teclas());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la ventana
		JFrame.setDefaultLookAndFeelDecorated(false); // Quitar bordes de la ventana
		setUndecorated(true); // Quitar bordes de la ventana
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); // Centrar la ventana

        setVisible(true); // Mostrar la ventana
        Momento momento = new Momento(); // Crear el hilo                   
		Thread trid = new Thread(momento); // Crear el hilo
		trid.start(); // Iniciar el hilo               
    }

    public void startGame() {  
		comida = new Point(200,100); // Posicion de la comida	
        snake = new Point(320,240); // Posicion de la serpiente
		listaPosiciones = new ArrayList<Point>(); // Lista de posiciones de la serpiente
        listaPosiciones.add(snake); // Agregar la posicion inicial de la serpiente

		longitud = listaPosiciones.size(); // Longitud de la serpiente   
    }

	public void generarComida() { // Generar comida en una posicion aleatoria
		Random rnd = new Random(); 
		
		comida.x = (rnd.nextInt(width)) + 5; // Posicion aleatoria en x
		if((comida.x % 5) > 0) { 
			comida.x = comida.x - (comida.x % 5); // Posicion aleatoria en x
		}

		if(comida.x < 5) { // Si la posicion es menor a 5
			comida.x = comida.x + 10; // Sumar 10
		}
		if(comida.x > width) { // Si la posicion es mayor al ancho de la ventana (aveces tiene bugs xd)
			comida.x = comida.x - 10; // Restar 10
		}

		comida.y = (rnd.nextInt(height)) + 5; // Posicion aleatoria en y
		if((comida.y % 5) > 0) { 
			comida.y = comida.y - (comida.y % 5); // Posicion aleatoria en y
		}	

		if(comida.y > height) {
			comida.y = comida.y - 10;
		}
		if(comida.y < 0) {
			comida.y = comida.y + 10;
		}

	}

	public void actualizar() {

        listaPosiciones.add(0,new Point(snake.x,snake.y)); // Agregar la posicion de la serpiente a la lista de posiciones
		listaPosiciones.remove(listaPosiciones.size()-1); // Eliminar la ultima posicion de la serpiente

        for (int i=1;i<listaPosiciones.size();i++) { // Recorrer la lista de posiciones
            Point point = listaPosiciones.get(i); // Obtener la posicion de la serpiente
            if(snake.x == point.x && snake.y  == point.y) { // Si la posicion de la serpiente es igual a la posicion de la lista (esto significa si choca)
                gameOver = true; // El juego termina
            }
        }

		if((snake.x > (comida.x-10) && snake.x < (comida.x+10)) && (snake.y > (comida.y-10) && snake.y < (comida.y+10))) { // Si la serpiente choca con la comida
            listaPosiciones.add(0,new Point(snake.x,snake.y)); // Agregar la posicion de la serpiente a la lista de posiciones
			System.out.println(listaPosiciones.size()); // Imprimir la longitud de la serpiente
			generarComida(); // Generar comida en una posicion aleatoria
		}
        imagenSnake.repaint(); 

	}

	public static void main(String[] args) { 
		Snake snake1 = new Snake(); // Crear el juego
	}

    public class ImagenSnake extends JPanel { // Clase para dibujar el juego
        public void paintComponent(Graphics g) { // Metodo para dibujar
            super.paintComponent(g); // Llamar al metodo de la clase padre
            
            if(gameOver) {
                g.setColor(new Color(61,176,205)); // Color de fondo
            } else {
                g.setColor(new Color(0,0,0)); // Color de fondo
            }
            g.fillRect(0,0, width, height); // Dibujar el fondo
            g.setColor(new Color(102,255,102)); // Color de la serpiente
    
            if(listaPosiciones.size() > 0) {
                for(int i=0;i<listaPosiciones.size();i++) { // Recorrer la lista de posiciones
                    Point p = (Point)listaPosiciones.get(i); // Obtener la posicion de la serpiente
                    g.fillRect(p.x,p.y,widthPoint,heightPoint); // Dibujar la serpiente
                }
            }
    
            g.setColor(new Color(255,102,102)); // Color de la comida
            g.fillRect(comida.x,comida.y,widthPoint,heightPoint); // Dibujar la comida
            
            if(gameOver) {
                // Dibujar el texto de fin del juego
                g.setFont(new Font("TimesRoman", Font.BOLD, 40));
                String gameOverText = "FIN DEL JUEGO :C";
                int textWidth = g.getFontMetrics().stringWidth(gameOverText);
                int x = (getWidth() - textWidth) / 2;
                g.drawString(gameOverText, x, 200);
                
                String scoreText = "PUNTAJE "+(listaPosiciones.size()-1);
                textWidth = g.getFontMetrics().stringWidth(scoreText);
                x = (getWidth() - textWidth) / 2;
                g.drawString(scoreText, x, 240);
            
                g.setFont(new Font("TimesRoman", Font.BOLD, 20));
                String newGameText = "PRESIONE N PARA UN NUEVO JUEGO";
                textWidth = g.getFontMetrics().stringWidth(newGameText);
                x = (getWidth() - textWidth) / 2;
                g.drawString(newGameText, x, 320);
                
                String exitText = "ESC PARA SALIR";
                textWidth = g.getFontMetrics().stringWidth(exitText);
                x = (getWidth() - textWidth) / 2;
                g.drawString(exitText, x, 340);
            }

        }
    }

	public class Teclas extends java.awt.event.KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {

			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0); // Salir del juego
			} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {

				if(direccion != "LEFT") { // Si la direccion no es izquierda
                    direccion = "RIGHT";// La direccion es derecha

				}
			} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				if(direccion != "RIGHT") {// Si la direccion no es derecha
                    direccion = "LEFT";// La direccion es izquierda
				}
			} else if(e.getKeyCode() == KeyEvent.VK_UP) {
				if(direccion != "DOWN") {// Si la direccion no es abajo
                    direccion = "UP";// La direccion es arriba
				}
			} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				if(direccion != "UP") {// Si la direccion no es arriba
                    direccion = "DOWN";// La direccion es abajo
				}				
			
			} else if(e.getKeyCode() == KeyEvent.VK_N) {// Si se presiona la tecla N
                gameOver = false;// El juego no ha terminado
                startGame();// Iniciar el juego	
			}
		}

	}

	public class Momento extends Thread { // Clase para el hilo del juego
		
		private long last = 0;
		
		public Momento() {
			
		}

		public void run() {
			while(true) {
				if((java.lang.System.currentTimeMillis() - last) > frequency) {
					if(!gameOver) {

                        if(direccion == "RIGHT") {
                            snake.x = snake.x + widthPoint;
                            if(snake.x > width) {
                                snake.x = 0;
                            }
                        } else if(direccion == "LEFT") {
                            snake.x = snake.x - widthPoint;
                            if(snake.x < 0) {
                                snake.x = width - widthPoint;
                            }                        
                        } else if(direccion == "UP") {
                            snake.y = snake.y - heightPoint;
                            if(snake.y < 0) {
                                snake.y = height;
                            }                        
                        } else if(direccion == "DOWN") {
                            snake.y = snake.y + heightPoint;
                            if(snake.y > height) {
                                snake.y = 0;
                            }                        
                        }
                    }
                    actualizar();
					
					last = java.lang.System.currentTimeMillis();
				}

			}
		}
	}

}