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

---
