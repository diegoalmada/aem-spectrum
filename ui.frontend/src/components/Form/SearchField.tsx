import React from 'react'
import { MapTo } from '@adobe/aem-react-editable-components'
import {SearchField as SearchFieldSpectrum} from '@adobe/react-spectrum'

type Props = any;

const SearchFieldEditConfig = {
  emptyLabel: 'Search Field',
  isEmpty(props:Props) {
    return !props?.label || props.label.trim().length < 1;
  },
};


const SearchField = ({ label, placeholder, quiet }:Props) => {
    
  let [currentText, setCurrentText] = React.useState('');

    return label ? <>
        <SearchFieldSpectrum
            label={label}
            placeholder={placeholder}
            onClear={() => setCurrentText('') }
            onChange={setCurrentText}
            isQuiet={quiet} />
        <pre>The switch is on: {currentText}</pre>        
    </>:null
}

export default MapTo('aem-spectrum/components/content/form/search-field')
(SearchField, SearchFieldEditConfig);
