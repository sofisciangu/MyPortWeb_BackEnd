class Persona {
    readonly name!: string; //ATRIBUTO
    readonly lastname!: string;
    private añoNac!: number; //
    constructor (name:string, lastname:string){ //CONSTRUCTOR
        this.name=name;
        this.lastname=lastname;
    } //
    public tostring(): string // METODOS Y MODIFICACDORES DE ACCESO
    {
        return this.name + this.lastname;
            }
    public edad (añoActual:number):number
    {
        return (añoActual - this.añoNac)
    } //
    }

// **ATRIBUTOS: Son variables que se declaran dentro de la clase, y sirven para indicar la forma o características de 
//cada objeto representado por esa clase. Los atributos, de alguna manera, muestran lo que cada objeto es, o también, 
//lo que cada objeto tiene. ATRIBUTOS DE LA CLASE PERSONA
//Sintaxis:  <nombre_variable>: <tipo_de_datos>
//**METODO: Son funciones, procedimientos o rutinas declaradas dentro de la clase, usados para describir el comportamiento 
//o las acciones de los objetos descriptos por esa clase. Los métodos, de alguna manera, muestran lo que cada objeto hace.
//La sintaxis es:  
//<nombre_método>(<parámetros>): <tipo_de_datos_devuelto>,  
//{ //**instrucciones*/} RENGLON 13/15
// **CONSTRUCTOR: es un método especial que permite instanciar un objeto. Su nombre está definido por la palabra constructor,
// y no tiene ningún tipo de retorno. Puede recibir 0 a n parámetros.
// Sintaxis: 
// Constructor(<parámetros>)
//{  /**instrucciones*/} EJE LINEA 5/8
// Este codigo suele usarse  para la inicialización de los atributos del objeto a crear, sobre todo cuando el valor de 
//éstos no es constante o incluye acciones más allá de una asignación de valor.
//MODIFICACIRES DE ACCESO: Se trata de ciertas palabras reservadas que colocadas delante de la declaración de un atributo 
//o de un método de una clase, hacen que ese atributo o ese método tengan accesibilidad más amplia o menos amplia desde 
//algún método que no esté en la clase. Así, los modificadores de acceso pueden ser: public, private , protected:
//● Public : un miembro público es accesible tanto desde el interior de la clase (por sus propios métodos), como desde el exterior de la misma (por métodos de otras clases).
//● Private: sólo es accesible desde el interior de la propia clase, usando sus propios métodos.
//● Readonly:  El acceso es de sólo lectura.
//●Protected: aplicable en contextos de herencia (tema que veremos más adelante), hace que un miembro sea público para sus clases derivadas y para clases en el mismo paquete, pero los hace privados para el resto.



