package net.sf.latexdraw.data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.sf.latexdraw.models.ShapeFactory;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class LineArcSupplier extends ParameterSupplier {
	@Override
	public List<PotentialAssignment> getValueSources(final ParameterSignature sig) throws Throwable {
		return Stream.of(ShapeFactory.INST.createRectangle(), ShapeFactory.INST.createSquare()).
			map(sh -> PotentialAssignment.forValue("", sh)).collect(Collectors.toList());
	}
}
