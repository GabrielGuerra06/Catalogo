package catalogoN;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Linki
 */
public class Catalogo implements InterfazCatalogo{
    
    static String emision = "cine"; 
    ImageIcon retorno;
    ConstructorPeliculas[] peliculas = new ConstructorPeliculas[20];
    ArrayList<ImageIcon> listaImagenes = new ArrayList();
    
   
    public Catalogo(){
          this.peliculas[0] = new ConstructorPeliculas("INTERESTELAR", "Un grupo de científicos y exploradores, encabezados por Cooper, se embarcan en un viaje espacial para encontrar un lugar con las condiciones necesarias para reemplazar a la Tierra y comenzar una nueva vida allí. La Tierra está llegando a su \n fin y este grupo necesita encontrar un planeta más allá de nuestra galaxia que garantice el futuro de la raza humana.","Ciencia ficción \n Aventura \n Misterio \n Drama","HBO MAX \n Amazon prime","Christopher Nolan \n Matthew McConaughey \n Anne Hathaway", "https://www.youtube.com/watch?v=LYS2O1nl9iM");
          this.peliculas[1]= new ConstructorPeliculas("WHIPLASH","Andrew Neiman es un joven y ambicioso baterista de jazz. Marcado por el fracaso de la carrera literaria de su padre, está obsesionado con alcanzar \n la cima dentro del elitista conservatorio de música de la Costa Este en el que estudia.","Música\ndrama\ncine independiente","Amazon prime\n Apple TV","Damien Chazelle\n Miles Teller\nJ. K. Simmons","https://www.youtube.com/watch?v=7d_jQycdQGo");
          this.peliculas[2]= new ConstructorPeliculas("EL RENACIDO", "Hugh Glass, un trampero y explorador de finales del siglo XIX resulta herido de muerte por el ataque de un oso. Sus compañeros deciden dejarle para proseguir con la expedición. Glass deberá enfrentarse a un territorio hostil para poder vengarse \n de quienes lo abandonaron a su suerte, especialmente de la traición llevada a cabo por quien consideraba su fiel confidente.","Aventura \n supervivencia \n Thriller \n Drama \n western ","Netflix","Alejandro González Iñárritu \n Leonardo DiCaprio \n Tom Hardy \n Will Poulter","https://www.youtube.com/watch?v=LoebZZ8K5N0" );
          this.peliculas[3]= new ConstructorPeliculas("FORREST GUMP","Sentado en un banco en Savannah, Georgia, Forrest Gump espera al autobús. Mientras éste tarda en llegar, el joven cuenta su vida a las personas que se sientan a esperar con él. Aunque sufre un pequeño retraso mental, esto no \n le impide hacer cosas maravillosas. Sin entender del todo lo que sucede a su alrededor, Forrest toma partido en los eventos más importantes de la historia de los Estados Unidos.","Drama \n comedia \n romance","Netflix \n HBO max \n Amazon prime","Robert Zemeckis \nTom Hanks \nRobin Wright","https://www.youtube.com/watch?v=bLvqoHBptjg");
          this.peliculas[4]= new ConstructorPeliculas("EL CALLEJÓN DE LAS ALMAS PERDIDAS","En el Nueva York de la década de 1940, el estafador Stanton Carlisle se une a una vidente y el esposo de esta, un mentalista, para robarle a un peligroso millonario. El grupo recibe \nla ayuda de una misteriosa psiquiatra que tiene su propio plan.","Suspenso \n acción \n drama \n Thriller psicológico \n misterio","Star plus","Guillermo del toro \n Bradley Cooper \n Cate Blanchett \n Rooney Mara","https://www.youtube.com/watch?v=Q81Yf46Oj3s");
          this.peliculas[5]= new ConstructorPeliculas("CODA","Ruby es el único miembro con audición de una familia de sordos. Cada mañana, antes de ir a clases, trabaja con sus padres y su hermano tratando \n de mantener a flote su negocio. En el coro del instituto, Ruby descubre su pasión por la música.","Drama \n musical \n comedia \n romance","Apple TV \n Amazon prime","Sian Heder \n Emilia Jones \n Eugenio Derbez \n Troy Kotsur","https://www.youtube.com/watch?v=0pmfrE1YL4I");
          this.peliculas[6]= new ConstructorPeliculas("BATMAN, EL CABALLERO DE LA NOCHE","Con la ayuda del teniente Jim Gordon y del Fiscal del Distrito Harvey Dent, Batman mantiene a raya el crimen organizado en Gotham. Todo cambia cuando aparece el Joker, un nuevo criminal \n  que desencadena el caos y tiene aterrados a los ciudadanos.","Acción \n suspenso \n aventura \n superhéroes \n crimen ","HBO max \n Apple TV \n Amazon prime","Christopher Nolan \n Christian Bale \n Heath Ledger \n Morgan Freeman","https://www.youtube.com/watch?v=dzQtWkpc2-c");
          this.peliculas[7]= new ConstructorPeliculas("SEVEN","El veterano teniente Somerset está a punto de jubilarse y ser reemplazado por el impulsivo detective David Mills. Ambos tendrán que colaborar en la resolución de unos asesinatos cometidos por un psicópata que \n se basa en los siete pecados capitales","Thriller psicológico \n misterio \n Crimen \n novela policiaca ","HBO max \n Apple TV \n Amazon prime","David Fincher \n  Brad Pitt \n Morgan Freeman \n  Kevin Spacey","https://www.youtube.com/watch?v=UenSg2kQtio");
          this.peliculas[8]= new ConstructorPeliculas("HASTA EL ÚLTIMO HOMBRE","Esta es la historia de Desmond T. Doss, un hombre contrario a la violencia que combatió como médico en la Segunda Guerra Mundial sin portar un arma. No disparó ni una bala, pero salvó a 75 personas \n de la muerte en la batalla de la isla de Okinawa. Gracias a su coraje, pasó de ser el objeto de las burlas de sus compañeros a ser reconocido por su enorme valía con la entrega de la Medalla de Honor del Congreso, otorgada por primera vez a un objetor de conciencia.","Guerra \n Drama \n Ficción histórica","HBO max\n Amazon prime \nApple Tv","Mel Gibson \n Andrew Garfield,","https://www.youtube.com/watch?v=QJUsNs7tLFA");
          this.peliculas[9]= new ConstructorPeliculas("INCEPTION","Dom Cobb (Leonardo DiCaprio) es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes. Su habilidad lo ha convertido \n en un atractivo en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama. Cobb tiene la oportunidad de ser perdonado cuando recibe una tarea imposible: plantar una idea en la mente de una persona. Si tiene éxito, será el crimen perfecto, pero un enemigo se anticipa a sus movimientos.","Acción \n Ciencia ficción \n Thriller \n Drama","HBO max \n Amazon prime \n Apple TV","Christopher Nolan \n Leonardo DiCaprio \n Tom Hardy \n Cillian Murphy","https://www.youtube.com/watch?v=YoHD9XEInc0");
          this.peliculas[10]= new ConstructorPeliculas("PRISONERS","Keller Dover se enfrenta a la peor pesadilla para un padre: la desaparición de su hija de seis años junto a una amiga. Pese a ello, Keller todavía tiene una pista de la que puede tirar: una autocaravana \n  que se encontraba aparcada en su calle.","Thriller \n misterio \n drama \n crimen, Policial","Amazon prime","Denis Villeneuve \n Jake Gyllenhaal \n Hugh Jackman \n Paul Dano","https://www.youtube.com/watch?v=Fy4LsPx4zac");
          this.peliculas[11]= new ConstructorPeliculas("THE POWER OF THE DOG","Los acaudalados hermanos Phil y George Burbank son las dos caras de la misma moneda. Phil es elegante y cruel, mientras que George es impasible y amable. Cuando George se casa en \n secreto con una viuda del pueblo, Phil lleva a cabo una guerra sádica e implacable usando a su afeminado hijo, Peter, como peón.","Western \n drama \n cine romántico","Netflix","Jane Campion \n Benedict Cumberbatch \n Kirsten Dunst \n Kodi Smith-Mcphee","https://www.youtube.com/watch?v=LRDPo0CHrko");
          this.peliculas[12]= new ConstructorPeliculas("YOUR NAME","Mitsuha es una adolescente que detesta su vida rural en el campo. Por otro lado, Taki es un chico que vive en Tokio y sueña con ser un artista o un arquitecto. Los destinos de estos \n jóvenes se entrelazan la noche en que dos estrellas caen del cielo, y comienzan a intercambiar sus cuerpos de la noche a la mañana. Con el pasar del tiempo, desarrollan maneras de comunicarse entre ellos y un creciente anhelo de conocerse en persona.","Anime \n Cine romántico \n Drama \n  Animación", "Apple TV","Makoto Shinkai","https://www.youtube.com/watch?v=N0nvoAv5q8M");
          this.peliculas[13]= new ConstructorPeliculas("SHUTTER ISLAND","Verano de 1954. Los agentes judiciales Teddy Daniels y Chuck Aule son enviados a una remota isla del puerto de Boston para investigar la desaparición de una peligrosa asesina recluida en el hospital \n psiquiátrico Ashecliffe, un centro penitenciario para criminales perturbados dirigido por el siniestro doctor John Cawley. Pronto descubrirán que el centro guarda muchos secretos y que la isla esconde algo más peligroso que los pacientes. ","Thriller psicológico \n terror \n misterio \n drama","HBO max \n Amazon prime \n Apple TV \n Netflix","Martin Scorsese \n Leonardo Di Caprio \n Mark Ruffalo","https://www.youtube.com/watch?v=5iaYLCiq5RM");
          this.peliculas[14]= new ConstructorPeliculas("COMO ENTRENAR A TU DRAGON","Hipo, un vikingo adolescente, comienza las clases de entrenamiento con dragones, y ve por fin una oportunidad para demostrar que es capaz de convertirse en guerrero, \n cuando hace amistad con un dragón herido.","Infantil \n acción \n comedia \n aventura \n fantasía \n animación","Netflix \n Apple TV","Chris Sanders \nDean DeBlois \n Jay Baruchel","https://www.youtube.com/watch?v=oKiYuIsPxYk");
          this.peliculas[15]= new ConstructorPeliculas("PARASITES","Tanto Gi Taek como su familia están sin trabajo. Cuando su hijo mayor, Gi Woo, empieza a impartir clases particulares en la adinerada casa de los Park, las dos familias, que tienen mucho en común \npese a pertenecer a dos mundos totalmente distintos, entablan una relación de resultados imprevisibles.","Thriller \n misterio\ndrama","Netflix\nApple TV\nAmazon","Bong Joon-ho\nCho Yeo-jeong\nChoi woo-Shik","https://www.youtube.com/watch?v=isOGD_7hNIY");
          this.peliculas[16]= new ConstructorPeliculas("LA LISTA DE SCHINDLER","El empresario alemán Oskar Schindler, miembro del Partido Nazi, pone en marcha un elaborado, costoso y arriesgado plan para salvar a más de mil judíos del Holocausto. ","Guerra\nhistoria\nblanco y negro\ndrama\ncine histórico","HBO max\nAmazon prime\n Apple TV\nNetflix","Steven Spielberg\nLiam Neeson\nRalph Fiennes\nBen Kingsley","https://www.youtube.com/watch?v=BmkchuRJ82w");
          this.peliculas[17]= new ConstructorPeliculas("JOKER","Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos acontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen.","Suspenso\nCrimen\nthriller psicológico\nDrama","Amazon prime\n Apple TV","Todd Phillips\n Joaquin Phoenix\nRobert De Niro","https://www.youtube.com/watch?v=t433PEQGErc");
          this.peliculas[18]= new ConstructorPeliculas("KLAUS", "A Jesper, el peor estudiante de la academia postal, le destinan a una gélida isla, donde sus conflictivos habitantes apenas\n intercambian palabras y, mucho menos, cartas. Jesper está a punto de rendirse cuando encuentra una aliada, Alva, la profesora del pueblo. También descubre a Klaus, un misterioso carpintero que vive aislado en una cabaña repleta de juguetes hechos a mano. ","Infantil\ncomedia\nanimación\naventura","Netflix","Sergio Pablos","https://www.youtube.com/watch?v=emYgXGRE4-Y");
          this.peliculas[19]= new ConstructorPeliculas("CADENA PERPETUA","Andrew Dufresne es un hombre inocente que es acusado del asesinato de su mujer. Tras ser condenado a cadena perpetua, es enviado a la cárcel \n de Shawshank, en Maine. Con el paso de los años, Andrew conseguirá ganarse la confianza del director del centro y el respeto de los otros convictos, especialmente de Red, el jefe de la mafia. ","Drama\ncarcelario\nmisterio\npolicial","HBO max\nAmazon prime\nApple TV\nNetflix","Frank Darabont\nMorgan Freeman\nTim Robins","https://www.youtube.com/watch?v=6hB3S9bIaco");

    }

    @Override
    public void calificacion(int calificacion) {
        calificacion ++;
    }
    
    @Override
    public void imagenes(){
        ImageIcon interestelar= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Interestelar.jpg");
          listaImagenes.add(interestelar);
        ImageIcon whiplash= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Whiplash.jpg");
          listaImagenes.add(whiplash);
        ImageIcon revenant= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Revenant.jpg");
          listaImagenes.add(revenant);
        ImageIcon forrestGump= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Forrest Gump.jpg");
          listaImagenes.add(forrestGump);
        ImageIcon NightmareAlley= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\El callejon de las almas perdidas.jpg");
          listaImagenes.add(NightmareAlley);
        ImageIcon coda= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\CODA.jpg");
          listaImagenes.add(coda);
        ImageIcon batman= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\batman-el-caballero-de-la-noche.jpg");
          listaImagenes.add(batman);
        ImageIcon seven= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\SE7EN.jpg");
          listaImagenes.add(seven); 
        ImageIcon hastaElUltimoHombre= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Hasta el último hombre.jpg");
          listaImagenes.add(hastaElUltimoHombre);
        ImageIcon inception= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\El origen.jpg");
          listaImagenes.add(inception);
        ImageIcon prisoners= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Prisoners.jpg");
          listaImagenes.add(prisoners);
        ImageIcon thePowerOfTheDog= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\The_Power_of_the_Dog.jpg");
          listaImagenes.add(thePowerOfTheDog);
        ImageIcon yourName= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Your name.jpg");
          listaImagenes.add(yourName);
        ImageIcon ShutterIsland= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Shutter Island.jpg");
          listaImagenes.add(ShutterIsland);
        ImageIcon comoEntrenarATuDragon= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Como entrenar a tu dragon.jpg");
          listaImagenes.add(comoEntrenarATuDragon);
        ImageIcon parasites= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\parasites.jpg");
          listaImagenes.add(parasites);
        ImageIcon laListaDeSchindler= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Schindlers list.jpg");
          listaImagenes.add(laListaDeSchindler);
        ImageIcon joker= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\joker.jpg");
          listaImagenes.add(joker);
        ImageIcon klaus= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Klaus.jpg");
          listaImagenes.add(klaus);
        ImageIcon cadenaPerpetua= new ImageIcon("D:\\Gabriel Guerra\\Documents\\docs\\OneDrive\\Documentos\\UNIVERSIDAD\\2 semestre\\P.O. objetos\\PROYECTO\\Shawshank redemption.jpg");
          
    }

    @Override
    public String emision() {
        return emision;
    }

    @Override
    public String titulo(int i) {
        return this.peliculas[i].titulo;
    }
    

    @Override
    public String sinopsis(int i) {
        return this.peliculas[i].sinopsis;
    }

    @Override
    public String genero(int i) {
        return this.peliculas[i].genero;
    }

    @Override
    public String plataforma(int i) {
        return this.peliculas[i].plataforma;
    }

    @Override
    public String reparto(int i) {
        return this.peliculas[i].reparto;
    }

    @Override
    public String url(int i) {
        return this.peliculas[i].url;
    }
  
}
