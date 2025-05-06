Feature: Gestión de reservas

  Scenario: Cancelar una reserva
    Given una reserva con estado "Pendiente"
    When el usuario cancela la reserva
    Then el estado de la reserva debe ser "Cancelada"