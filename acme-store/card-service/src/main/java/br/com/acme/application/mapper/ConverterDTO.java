package br.com.acme.application.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

/**
 * @author pedroRhamon
 */
@Component
@AllArgsConstructor
public final class ConverterDTO<T> {

    private final ModelMapperConfig modelMapperConfig;

    public T convertObject(T object, Class<T> type){
        return modelMapperConfig.modelMapper().map(object, type);
    }

    public List<T> convertLIstObjects(List<T> objects, Class<T> type ) {
        return objects.stream()
                .map(response -> new ModelMapper().map(response, type))
                .collect(Collectors.toList());
    }
}

