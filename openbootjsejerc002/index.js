// Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:

// - Tu nombre (string)

// - Tu edad (number)

// - ¿Eres desarrollador? (boolean)

// - Tu fecha de nacimiento (Date)

// - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)

const lista = [
  "Pere Josep",
  54,
  (eresDesarrollador = false),
  new Date("june 12 1968"),
  {
    titulo: "El autoestopista galáctico",
    autor: "Douglas Adams",
    fecha: new Date("october 1979"),
    url: "https://www.anagrama-ed.es/libro/compactos/guia-del-autoestopista-galactico/9788433961037/CM_454",
  },
];

console.log(lista);
