# 📋 Formulario ADCAL — Java Swing

Aplicación de escritorio desarrollada en **Java Swing** que implementa un formulario de contacto para la empresa ADCAL, aplicando los principios de la **Programación Orientada a Objetos (POO)**.

---

## 👥 Autores

- Jose Maria Raymondi Nicolas
- Eloy Matos

**Curso:** Programación Orientada a Objetos  
**Institución:** Valle Grande

---

## 📌 Descripción

El formulario permite registrar los datos de contacto de clientes interesados en los productos de ADCAL, incluyendo información personal, ubicación geográfica y un mensaje u observación. Al enviar el formulario, el sistema valida los campos obligatorios y muestra un resumen de los datos ingresados.

---

## 🏗️ Estructura del Proyecto

```
FormularioADCAL/
└── src/
    ├── controller/
    │   └── AdcalController.java   # Lógica y eventos del formulario
    ├── model/
    │   └── Cliente.java           # Modelo de datos (encapsulamiento)
    ├── view/
    │   └── AdcalFormView.java     # Interfaz gráfica con Java Swing
    └── Main.java                  # Punto de entrada de la aplicación
```

---

## 🧱 Pilares de POO aplicados

| Pilar | Aplicación en el proyecto |
|---|---|
| **Encapsulamiento** | Los atributos de `Cliente` son privados y se acceden mediante getters |
| **Abstracción** | Cada clase tiene una responsabilidad clara y definida |
| **Herencia** | `AdcalFormView` extiende de `JFrame` |
| **Separación de responsabilidades** | Patrón MVC: modelo, vista y controlador separados |

---

## 🖼️ Componentes de Java Swing utilizados

| Componente | Uso en el formulario |
|---|---|
| `JFrame` | Ventana principal de la aplicación |
| `JPanel` | Organización de secciones del formulario |
| `JLabel` | Etiquetas descriptivas de cada campo |
| `JTextField` | Campos de texto: nombre, correo, teléfono, etc. |
| `JComboBox` | Selector de "¿Cómo nos conociste?" |
| `JTextArea` | Campo de mensaje u observación |
| `JButton` | Botones Enviar y Limpiar |
| `JOptionPane` | Diálogos de validación y confirmación |

---

## ✅ Funcionalidades

- Registro de datos de contacto del cliente
- Validación de campos obligatorios (nombre, correo, teléfono)
- Selector desplegable para indicar cómo conoció a ADCAL
- Campos de ubicación: departamento, distrito y provincia
- Campo de mensaje u observación
- Botón **Enviar** que muestra resumen con `JOptionPane`
- Botón **Limpiar** que resetea todos los campos

---
Muestra:
<img width="785" height="360" alt="image" src="https://github.com/user-attachments/assets/58fc00f3-87a0-4a7f-903b-18d261d7a900" />
