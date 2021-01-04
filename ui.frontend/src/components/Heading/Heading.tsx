import React from 'react'
import { MapTo } from '@adobe/aem-react-editable-components'
import {Heading as HeadingSpectrum} from '@adobe/react-spectrum'

type Props = any;

const HeadingEditConfig = {
  emptyLabel: 'Heading',
  isEmpty(props:Props) {
    return !props?.text || props.text.trim().length < 1;
  },
};


const Heading = ({ text, level }:Props) => {

    return text ? <HeadingSpectrum 
            level={level}>
                { text }
        </HeadingSpectrum>:null
}

export default MapTo('aem-spectrum/components/content/heading')
(Heading, HeadingEditConfig);
