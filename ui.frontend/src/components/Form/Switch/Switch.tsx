import React, {useEffect} from 'react'
import { MapTo } from '@adobe/aem-react-editable-components'
import {Switch as SwitchSpectrum} from '@adobe/react-spectrum'

type Props = any;

const SwitchEditConfig = {
  emptyLabel: 'Switch',
  isEmpty(props:Props) {
    return !props?.text || props.text.trim().length < 1;
  },
};


const Switch = ({ text, accessibilityLabel, selected }:Props) => {
    
    let [select, setSelection] = React.useState(false);

    useEffect(() => {
        setSelection(selected);
    }, [selected])

    return text ? <>
        <SwitchSpectrum 
            aria-label={accessibilityLabel}
            isSelected={select}
            onChange={setSelection}>
                {text}
        </SwitchSpectrum>
        <div>The switch is on: {select.toString()}</div>        
    </>:null
}

export default MapTo('aem-spectrum/components/content/form/switch')
(Switch, SwitchEditConfig);
