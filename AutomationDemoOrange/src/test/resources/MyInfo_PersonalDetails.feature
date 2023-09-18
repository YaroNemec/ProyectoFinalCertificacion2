Feature: Mi informacion personal en Demo Orange

  Background: Completar informacion personal del usuario en Orange
    Given Estoy en Orange

    @CambiarMiInformacionPersonal
    Scenario: Actualizar mi informacion en la pagina de Orange
      Given Coloco como username "Admin"
      And Coloco de contraseña "admin123"
      When Le doy click al botón Login
      Then Doy click en My Info Button
      And Los detalles personales deberian mostrarse
      And Relleno los detalles personales con
        | Yaro | Nemec | 0013 | 111444777 | 2025-07-12 | 123456789 | 123123123 |
      And Doy click en el boton guardar detalles generales
     # And Verifico los siguientes datos en la pagina de Datos Personales
         #  | Yaro | Nemec | 0013 | 111444777 | 2025-07-12 | 123456789 | 123123123 |
      #And Doy click en el user drop down
      #And Doy click en el boton de Logout