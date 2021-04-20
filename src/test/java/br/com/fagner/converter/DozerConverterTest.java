package br.com.fagner.converter;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.fagner.converter.mocks.MockPerson;
import br.com.fagner.data.model.CamposTabelaPerson;
import br.com.fagner.data.vo.CamposTabelaPersonVO;

public class DozerConverterTest {
	
    MockPerson inputObject;

    @Before
    public void setUp() {
        inputObject = new MockPerson();
    }

    @Test
    public void parseEntityToVOTest() {
        CamposTabelaPersonVO output = DozerConverter.parseObject(inputObject.mockEntity(), CamposTabelaPersonVO.class);
        Assert.assertEquals(12l, (long) output.getId());
        Assert.assertEquals("First Name Test0", output.getFirstName());
        Assert.assertEquals("Last Name Test0", output.getLastName());
        Assert.assertEquals("Addres Test0", output.getAddress());
        Assert.assertEquals("Male", output.getGender());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<CamposTabelaPersonVO> outputList = DozerConverter.parseListObjects(inputObject.mockEntityList(), CamposTabelaPersonVO.class);
        CamposTabelaPersonVO outputZero = outputList.get(0);

        Assert.assertEquals(12l, (long) outputZero.getId());
        Assert.assertEquals("First Name Test0", outputZero.getFirstName());
        Assert.assertEquals("Last Name Test0", outputZero.getLastName());
        Assert.assertEquals("Addres Test0", outputZero.getAddress());
        Assert.assertEquals("Male", outputZero.getGender());

        CamposTabelaPersonVO outputSeven = outputList.get(7);

        Assert.assertEquals(12l, (long) outputSeven.getId());
        Assert.assertEquals("First Name Test7", outputSeven.getFirstName());
        Assert.assertEquals("Last Name Test7", outputSeven.getLastName());
        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
        Assert.assertEquals("Female", outputSeven.getGender());

        CamposTabelaPersonVO outputTwelve = outputList.get(12);

        Assert.assertEquals(12l, (long) outputTwelve.getId());
        Assert.assertEquals("First Name Test12", outputTwelve.getFirstName());
        Assert.assertEquals("Last Name Test12", outputTwelve.getLastName());
        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
        Assert.assertEquals("Male", outputTwelve.getGender());
    }

    @Test
    public void parseVOToEntityTest() {
        CamposTabelaPerson output = DozerConverter.parseObject(inputObject.mockVO(), CamposTabelaPerson.class);
        Assert.assertEquals(12l, (long) output.getId());
        Assert.assertEquals("First Name Test0", output.getFirstName());
        Assert.assertEquals("Last Name Test0", output.getLastName());
        Assert.assertEquals("Addres Test0", output.getAddress());
        Assert.assertEquals("Male", output.getGender());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<CamposTabelaPerson> outputList = DozerConverter.parseListObjects(inputObject.mockVOList(), CamposTabelaPerson.class);
        CamposTabelaPerson outputZero = outputList.get(0);

        Assert.assertEquals(12l, (long) outputZero.getId());
        Assert.assertEquals("First Name Test0", outputZero.getFirstName());
        Assert.assertEquals("Last Name Test0", outputZero.getLastName());
        Assert.assertEquals("Addres Test0", outputZero.getAddress());
        Assert.assertEquals("Male", outputZero.getGender());

        CamposTabelaPerson outputSeven = outputList.get(7);
        
        Assert.assertEquals(12l, (long) outputSeven.getId());
        Assert.assertEquals("First Name Test7", outputSeven.getFirstName());
        Assert.assertEquals("Last Name Test7", outputSeven.getLastName());
        Assert.assertEquals("Addres Test7", outputSeven.getAddress());
        Assert.assertEquals("Female", outputSeven.getGender());

        CamposTabelaPerson outputTwelve = outputList.get(12);
        
        Assert.assertEquals(12l, (long) outputTwelve.getId());
        Assert.assertEquals("First Name Test12", outputTwelve.getFirstName());
        Assert.assertEquals("Last Name Test12", outputTwelve.getLastName());
        Assert.assertEquals("Addres Test12", outputTwelve.getAddress());
        Assert.assertEquals("Male", outputTwelve.getGender());
    }
}
