package io.github.marciliodevjava.domain.validation.constrainValidation;

import java.util.List;

import javax.validation.ConstraintValidatorContext;

import io.github.marciliodevjava.domain.validation.NotEmptyList;

public interface ConstrainValidator<T1, T2> {

	public boolean isValid(List<?> list, ConstraintValidatorContext constraintValidatorContext);

	public void initialize(NotEmptyList contraintAnnotation);
}
