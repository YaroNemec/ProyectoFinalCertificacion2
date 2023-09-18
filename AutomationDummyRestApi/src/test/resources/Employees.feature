Feature: Employees endpoint
  Background: Los endpoints empleados deben permitir obtener, crear, actualizar y eliminar empleados

  @getAll
  Scenario: /employees debe devolver a todos los empleados
    Given Realizo un GET al endpoint de los empleados
    Then Verifico que se devuelve el status code 200
    And Compruebo que el body no tiene un tamaño de 0

  @post
  Scenario: /create debería crear un empleado
    Given Realizo un POST en el endpoint create con los siguientes datos
      | Yaro | 4500 | 22 |
    Then Verifico que se devuelve el status code 200
    And Compruebo que el body no tiene un tamaño de 0
    And Verifico los siguientes datos en el body response
      | Yaro | 4500 | 22 |

  @getId
  Scenario: /employee/id debería devolver un empleado con una identificación específica
    Given Realizo un GET con una identificación específica igual a "1" para el endpoint del empleado
    Then Verifico que se devuelve el status code 200
    And Verifico los siguientes datos en el body response completo
      | 1 | Tiger Nixon | 320800 | 61 |  |
    And Verifico que el mensaje dice "Successfully! Record has been fetched."

  @put
  Scenario: /update debería devolver una actualización del empleado con una identificación específica
    Given Realizo un PUT en el update endpoint con el ID "2"
      | Pedro | 4000 | 28 |
    Then Verifico que se devuelve el status code 200
    And Verifico los siguientes datos en el body response
      | Pedro | 4000 | 28 |
    And Verifico que el mensaje dice "Successfully! Record has been updated."

  @delete
  Scenario: /delete debería devolver la eliminación de un empleado con una identificación específica
    Given Realizo un DELETE con una identificación específica igual a "10" en el endpoint del empleado
    Then Verifico que se devuelve el status code 200
    And Verifico que el number data eliminado sea igual a "10"
    And Verifico que el mensaje dice "Successfully! Record has been deleted"

  @postValuesNulls
  Scenario: /create no debería crear un empleado
    Given Realizo un POST en el endpoint create con los siguientes datos
      |  |  |  |
    Then Verifico que se devuelve el status code 200
    And Compruebo que el body no tiene un tamaño de 0
    And Verifico los siguientes datos en el body response
      |  |  |  |
    And Verifico que el mensaje dice "Successfully! Record has been added."



