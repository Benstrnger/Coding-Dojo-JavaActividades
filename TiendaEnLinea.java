public class TiendaEnLinea {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = ", El total de tu compra es: $";
       
        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 15.99;
        double precioCamiseta = 25.50;
        double precioPantalones = 25.50;
        double precioZapatos = 25.50;
   
        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Alex";
        String cliente3 = "Miguel";
   
        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = true;
        boolean pedidoConfirmadoCliente3 = true;
   
        // INTERACCIÓN DE LA APLICACIÓN
        System.out.println(mensajeBienvenida + cliente1); // Muestra "Bienvenido a nuestra tienda en línea, Ana"
        // ** Aquí irán las declaraciones de impresión relacionadas con la interacción del cliente ** //
        if (pedidoConfirmadoCliente1 == true) {
            System.out.println(cliente1+mensajeConfirmacion);
        }

        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3+mensajeConfirmacion);
            System.out.println(cliente3+mensajeMostrarTotal+(precioZapatos+precioLibro)+" $"+(precioPantalones+precioCamiseta)+" Diferencia "+((precioPantalones+precioCamiseta)-(precioZapatos+precioLibro)));
        }

        if (pedidoConfirmadoCliente2) {
            System.out.println(cliente2+mensajeMostrarTotal+(precioZapatos*2+precioCamiseta+precioPantalones));
        }


    }
}