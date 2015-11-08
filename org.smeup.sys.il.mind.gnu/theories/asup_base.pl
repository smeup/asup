:- build_in(asup_isa/2, 'org.abchip.clyde.logic.Predicate_isa').
:- build_in(asup_filter/3, 'org.abchip.clyde.logic.Predicate_filter').
:- build_in(asup_value/3, 'org.abchip.clyde.logic.Predicate_value').

// Use as
asup_usa(_object, _interface) :- asup_ako(_object, _interface).
asup_usa(_object, _object).

// Used by
asup_usb(_interface, _object) :- asup_usa(_object, _interface).

// Has
asup_has(_object,_slot,_like) :- asup_slot(_frame,_slot), asup_isa(_object, _frame), asup_filter(_object,_slot,_like).