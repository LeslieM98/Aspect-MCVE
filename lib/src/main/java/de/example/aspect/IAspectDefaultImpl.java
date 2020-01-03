package de.example.aspect;

public class IAspectDefaultImpl implements IAspect
{
    @Override
    public String hello()
    {
        return "hello";
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return false;
    }
}
