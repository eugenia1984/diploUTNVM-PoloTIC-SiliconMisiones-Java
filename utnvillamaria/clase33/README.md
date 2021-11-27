#  Clase 33 : 16 Noviembre

Temas:

- Ejemplo de UML

---

## Ejemplo de UML

```
-----------------------------------------------------
                         Personas
-----------------------------------------------------
-nombre: String
-apellido: String
-legajo: int
-----------------------------------------------------
+Persona(nombre String, apellido String, legajo int)
+getnombre() String
+getApellifo() String
+getLegajo() int
-----------------------------------------------------
     ^                                          ^
     |                                          |
----------------------------------      ---------------------------------
      Profesor                               Alumno
----------------------------------      ---------------------------------- 
-horasRestantes int                      -aniodeingreso int
-salarios List<float>                    -cursadas List<Curso>
-cursosAsignados List<Curso>             
-------------------------------------    ---------------------------------  
+Profesores(String nombre, apellido       +Alumno(String nombre, apellido 
String, legajo int, horasRestantes int)   String, legajo int, anioDeIngreso
+getCantidadHoras int                     int)
+addCurso(curso) void                     +getAnioDeingreso() int
+getSalarios() List<float>                +addCurso(curso) void
--------------------------------------     ---------------------------------  
             |                                |
             |1...*                           |*...1
             |                                |
     ---------------------------------------------------
                             Curso
     ---------------------------------------------------
      -nombre String
      -horasRequeridas int
      -alumnos List<Alumno>
      -notas list<float>
      -modalidad String
     ---------------------------------------------------
     +Curso(nombre String, modalidad String, horas int)
     +getNombre() String
     +getHorasRequeridas() int
     +addAlumno(alumno) void
     ---------------------------------------------------
```


Ejemplo en código:

```
public class Alumno extends Personal {
  private int anioDeingreso;
  private List<Curso1> cursadas;
  
  public Alumno1 (String nombre, String apellido, int legajo, int aniodeingreso) {
    super(nombre, apellido, legajo);
    this.anioDeingreso = anioDeingreso;
    cursadas = new ArrayLiast<>;
  }
  
  public int getAnioDeingreso() {
    return aniodeingreso;
  }
  
  public void addCurso(Curso1 curso) {
    this.cursadas = cursadas;
  }
  
  public int promedioHoras(String modalidad) {
    int suma = 0;
    int p = 0;
    
    for(int i=0; i<cursadas.size(); i++) {
      if(cursadas.get(i).getModalidad().equlas(modalidad) {
        suma = cursadas.get(i).getHorasRequeridas();
        p = p+1;
      }
      return suma /p;
    }
    
  }
  
}
```

---

## Desarrollo de Software

### Capacidades profesionales a las que contribuye el Desarrollo de Software

- Integrar un equipo en el contexto de un Proyecto de Desarrollo de Software -> **comunicación**

- **Dimensionar** su trabajo en el contexto del proyecto de desarrollo de software


### Características del Software

- El software es intangible

- Tiene alto contenido intelectual

- No es reconocido como un activo por los contadores, por lo que no está en los balances

- Su proceso de desarrollo es intensivo, basado en equipos y contruido en proyectos

- No exhibe una separación profunda entre I&D (investigación y desarrollo) y producción

- Puede ser modificado en forma permanente

### ¿ Que es el software?

Un conjunto de:

- programas

- procedimientos

- reglas

- documentación

- datos

###  Definición  de software

Es un set de programas y la documentación que acompaña.

Existen tres tipos básicos de software: system software / unitarios / software de aplicación

### Ingeniería de software

**Disciplinas técnicas**:

- requerimientos

- análisis y diseño

- construcción

- prueba

- despliegue

**Disciplinas de gestión**:

- planificación de proyecto

- monitores y control de proyectos

**Disciplinas de soporte**:

- gestión de configuración de software

- asegurameinto de calidad

- métricas


El objetivo principal que busca la ingeniería de software es convert¡ir el desarrollo de ssoftware en un proceso formal, con resultados predecibles, que permitan obtener un producto final de alta calidad; que satisfaga las necesidades y expectativas del cliente

herramientas -> métodos -> proceso -> un enfoque de calidad

### Proceso de software

Un conjunto de actividades, métodos, prácticas y transformaciones que la gente usa para desarrollar o mantener software y sus productos asociados.

Se necesitan personas con habilidades, entrenamiento y motivación.

### Ciclos de vida

Es una representación de un proceso. Grafica una descripción del proceso desde una perspectiva particular.

Los modelos especifican:

- Las fases de proceso. Ejemplo: requerimientos, especificaicón, diseño

- El orden en el cual se llevan a cabo

hay tres tipos:

- secuencial, no se usa mucho, primero requerimientos, luego arquitectura, luego desarrollo, al final test; pero cuando estoy por el desarrollo se me modifican los requerimientos, no es efectivo

- iterativo (se tiene una idea completa del producto final, al comenzar hay certeza absoluta sobre el resultado final deseado) / incremental (voy agregando funcionalidad a mi producto, se va construyendo un borrador, se valida y luego se sigue agregando calidad al producto. Al comenzar no hya certeza sobre el resultado deseado, se va construyendo a medida que se avanza  se va viendo el producto).

- recursivo, hay una metodología en cascada: requerimientos -> analisis y diseño -> implementación -> prueba -> operación y mantenimiento. 

Es dificil mantener la documentación.

Surge la cascada con subproyectos

---

